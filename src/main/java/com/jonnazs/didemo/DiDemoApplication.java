package com.jonnazs.didemo;

import com.jonnazs.didemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");


        StreamController streamController = (StreamController) ctx.getBean("streamController");
        streamController.executeStreamAndLambda();

        ArrayListController arrayListController = (ArrayListController) ctx.getBean("arrayListController");
        arrayListController.sortSample();
        System.out.println(myController.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
