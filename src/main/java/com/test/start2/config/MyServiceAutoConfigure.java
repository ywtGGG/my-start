package com.test.start2.config;

import com.test.start2.service.MyStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MyStartService.class)
@EnableConfigurationProperties(MyServiceConfigProperties.class)
public class MyServiceAutoConfigure {

    @Autowired
    private  MyServiceConfigProperties myServiceConfigProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "com.test.mystart",name = "open",havingValue = "true")
    MyStartService injectMyStartService(){
        return new MyStartService(myServiceConfigProperties.getName(),myServiceConfigProperties.getMsg());
    }
}
