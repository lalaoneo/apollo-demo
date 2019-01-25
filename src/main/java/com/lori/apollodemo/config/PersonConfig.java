package com.lori.apollodemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}