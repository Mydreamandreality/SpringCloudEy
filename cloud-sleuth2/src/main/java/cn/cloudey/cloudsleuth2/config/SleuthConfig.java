package cn.cloudey.cloudsleuth2.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 張燿峰
 *
 * @author 孤
 * @date 2018/12/29
 * @Varsion 1.0
 */
@Configuration
public class SleuthConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    @Bean
    public Sampler sampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
