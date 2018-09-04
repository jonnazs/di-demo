package com.jonnazs.didemo.controllers;

import com.jonnazs.didemo.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;


    //@Autowired //Es buena practica colocar el Autowired para los constructores tambien

    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
