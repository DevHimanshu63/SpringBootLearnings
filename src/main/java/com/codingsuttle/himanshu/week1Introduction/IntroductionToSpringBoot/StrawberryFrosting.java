package com.codingsuttle.himanshu.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawberryFrosting implements Frosting{

    public String getFrostingType(){
        return "Strawberry Frosting";
    }

}
