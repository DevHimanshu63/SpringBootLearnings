package com.codingsuttle.himanshu.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//using Stereotype Annotations
//@Component

public class Apple {

    void eatApple(){
        System.out.println("I am eating apple");
    }

    @PostConstruct  //lifecycle methods
    void callThisBeforeAppleIsUsed(){
        System.out.println("creating the apple before use");
    }

    @PreDestroy // lifecycle methods
    void callThisBeforeDestroy(){
        System.out.println("Destroying the apple bean");
    }


}
