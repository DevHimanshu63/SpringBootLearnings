package com.codingsuttle.himanshu.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
//	@Autowired  Dependency injection it is injecting the Apple beans here
//  Apple obj ;
//	Apple Apple1 ;

//	@Autowired
//	Apple Apple2 ;

//	@Autowired
//	DBService dbService ;
	@Autowired
	CakeBaker cake ;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
//		Apple1.eatApple();
//		Apple2.eatApple();
//		System.out.println(Apple1.hashCode());
		cake.bakeCake();
//		System.out.println(dbService.getData());

	}
}
