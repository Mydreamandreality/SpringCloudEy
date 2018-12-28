package cn.cloudey.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 張燿峰
 *
 * @author 孤
 * @date 2018/12/28
 * @Varsion 1.0
 */
@RestController
public class ConfigClientController {
    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String configClientValue(){
        return foo;
    }
}
