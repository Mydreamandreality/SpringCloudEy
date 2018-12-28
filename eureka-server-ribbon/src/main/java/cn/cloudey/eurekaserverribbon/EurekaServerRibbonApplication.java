package cn.cloudey.eurekaserverribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient //向服务中心注册
@EnableHystrix      //开启断路器
public class EurekaServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerRibbonApplication.class, args);
    }

}

