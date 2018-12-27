package cn.cloudey.eurekaserverfeign.Controller;

import cn.cloudey.eurekaserverfeign.FeignService.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 張燿峰
 *
 * @author 孤
 * @date 2018/12/27
 * @Varsion 1.0
 */
@RestController
public class FeignController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    private SchedualService schedualService;

    @GetMapping("/hi")
    public String feignClient(@RequestParam(value = "name")String name){
        return schedualService.sayHiClient(name);
    }
}
