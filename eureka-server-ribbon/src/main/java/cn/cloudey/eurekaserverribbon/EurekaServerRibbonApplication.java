package cn.cloudey.eurekaserverribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //向服务中心注册
public class EurekaServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerRibbonApplication.class, args);
    }

}

