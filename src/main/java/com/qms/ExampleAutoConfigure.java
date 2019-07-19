package com.qms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author ycl
 * @Date 2019/7/19 13:12
 * @Version 1.0
 **/
@Configuration
@ConditionalOnClass(ExampleService.class)
@EnableConfigurationProperties(ExampleServiceProperties.class)
public class ExampleAutoConfigure {

    @Autowired
    private ExampleServiceProperties properties;

    public ExampleAutoConfigure() {
        System.out.println("ExampleAutoConfigure cons....");
    }


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "com.qms.autoconfigure",value = "enabled",havingValue = "true")
    ExampleService exampleService (){
        return  new ExampleService(properties.getPrefix(),properties.getSuffix());
    }

}
