package cn.cloudey.eurekaserverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 張燿峰
 *<p>通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口，
 * 直接用的程序名替代了具体的url地址，
 * 在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名</p>
 * @author 孤
 * @date 2018/12/27
 * @Varsion 1.0
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiRibbonService(String name){
        //调用服务提供方接口,动态port,代表负载均衡成功
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
}
