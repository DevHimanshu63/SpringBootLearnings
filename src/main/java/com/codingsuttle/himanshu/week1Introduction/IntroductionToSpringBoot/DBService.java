package com.codingsuttle.himanshu.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//        @Autowired //this is field injection
       final private DB db ;

    // constructor injection this is more useful than Autowired field injection
        public DBService(DB db){
            this.db = db ;
        }

        String getData(){
            return db.getData();
        }
}

