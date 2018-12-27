package cn.cloudey.eurekaserverribbon.controller;

import cn.cloudey.eurekaserverribbon.service.RibbonService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 張燿峰
 * 服务消息方控制器
 *
 * @author 孤
 * @date 2018/12/27
 * @Varsion 1.0
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiRibbonService(name);
    }
}
