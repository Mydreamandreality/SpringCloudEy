package cn.cloudey.eurekaserverfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient     //此注解开启关闭不影响功能,具体原因待研究
@EnableFeignClients     //开启feign功能
public class EurekaServerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerFeignApplication.class, args);
    }
}

