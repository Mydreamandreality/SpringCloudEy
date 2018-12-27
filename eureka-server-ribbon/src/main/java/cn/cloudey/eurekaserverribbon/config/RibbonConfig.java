package cn.cloudey.eurekaserverribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 張燿峰
 * <p>restRemplate开启负载均衡的功能<p/>
 *
 * @author 孤
 * @date 2018/12/27
 * @Varsion 1.0
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate rstTemplate() {
        return new RestTemplate();
    }
}
