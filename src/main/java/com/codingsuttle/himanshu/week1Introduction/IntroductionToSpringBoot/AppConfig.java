package com.codingsuttle.himanshu.week1Introduction.IntroductionToSpringBoot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


//explicit declaration of beans in config file static factory annotation
@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")  //scope of bean it can be singleton and prototype and others
    Apple eatApple(){
        return new Apple();
    }

}

