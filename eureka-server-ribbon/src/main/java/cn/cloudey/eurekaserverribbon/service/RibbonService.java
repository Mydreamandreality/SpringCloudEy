package cn.cloudey.eurekaserverribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    /**
     * hiError是熔断触发之后需要返回的方法
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiRibbonService(String name){
        //调用服务提供方接口,动态port,代表负载均衡成功
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

    /**
     * 熔断器返回方法
     * @return
     */
    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
