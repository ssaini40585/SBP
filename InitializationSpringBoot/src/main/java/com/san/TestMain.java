package com.san;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = SpringApplication.run(TestMain.class, args);
		//will run later beacause of @lazy annotation defined in class Test1
		Test1 t1 = (Test1) ctx.getBean("test1");
		
		//will run first because by default it load first (can say @eager loading)
		Test2 t2 = (Test2) ctx.getBean("test2");
		
	}

}
