package com.jonnazs.didemo.controllers;

import org.springframework.stereotype.Controller;

import java.security.SecureRandom;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class StreamController {
        public void executeStreamAndLambda(){
            int value = IntStream.rangeClosed(1,10).sum();
            System.out.println("This is my first Stream = " +value);
            int val2 = IntStream.rangeClosed(1,10) //Sum the even ints from 2 to 20
                    .map((int x)->{
                        x+=x;
                        System.out.print("Number: "+x+"\n");
                        return x*2;
                    }) //Multiply by 2
                    .sum();

            System.out.println("This is a maped Stream with a Lambda= " +val2);

            int tripleEven = IntStream.rangeClosed(1,10)
                    .filter(x->x%2 == 0)
                    .map(x->x*3)
                    .sum();

            System.out.println("This is a filtered Stream with 2 Lambdas= " +tripleEven);




            System.out.println("Random numbers on separate lines:");

            SecureRandom randomNumbers =  new SecureRandom();
            randomNumbers.ints(10, 1, 7)
                    .forEach(System.out::println);


            String numbers = randomNumbers.ints(10, 1, 7)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "));

            System.out.printf("%nRandom numbers on one line: %s%n", numbers);


        }
}
