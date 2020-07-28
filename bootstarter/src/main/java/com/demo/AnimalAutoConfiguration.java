package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ligen
 * @title: AnimalAutoConfiguration
 * @projectName java
 * @description:
 * @date 2020/7/288:48
 */
@Configuration
@EnableConfigurationProperties(AnimalProperties.class)
@ConditionalOnClass(AnimalProperties.class)
public class AnimalAutoConfiguration {

    @Autowired
    private AnimalProperties animalProperties;

    @Bean
    @ConditionalOnMissingBean(AnimalService.class)
    public AnimalService animalService() {
        return new AnimalService(animalProperties);
    }

}