package cn.cloudey.eurekaserverfeign.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 張燿峰
 *
 * @author 孤
 * @date 2018/12/27
 * @Varsion 1.0
 */
@FeignClient(name = "eureka-client")    //name来指定调用哪个服务
public interface SchedualService {

    /**
     * 调用eureka-client的hi接口
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    String sayHiClient(@RequestParam(value = "name")String name);
}
