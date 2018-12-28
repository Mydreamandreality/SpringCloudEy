package cn.cloudey.cloudconfigclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by 張燿峰
 *
 * @author 孤
 * @date 2018/12/28
 * @Varsion 1.0
 */
@Configuration
public class ClientConfig {

    /**
     * <P>解决如果多配置文件时找不到属性报错问题</P>
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }
}
