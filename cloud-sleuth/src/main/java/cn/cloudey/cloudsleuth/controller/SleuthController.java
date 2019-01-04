package cn.cloudey.cloudsleuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 張燿峰
 *
 * @author 孤
 * @date 2018/12/29
 * @Varsion 1.0
 */
@RestController
public class SleuthController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/hi")
    public String callHome(){
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        return "i'm service-hi";
    }
}
