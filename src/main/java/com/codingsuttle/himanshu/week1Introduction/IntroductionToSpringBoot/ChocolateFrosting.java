package com.codingsuttle.himanshu.week1Introduction.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{

    public String getFrostingType(){
        return "chocolate Frosting";
    }
}