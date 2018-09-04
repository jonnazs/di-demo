package com.jonnazs.didemo.controllers;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Collections;

@Controller
public class ArrayListController {
    public void sortSample(){


        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Blue");
        myArray.add("Red");
        myArray.add("Green");
        myArray.add("Black");
        System.out.println("ArrayList sorting example: "+ myArray);
        Collections.sort(myArray);
        System.out.println("Sorting...");
        System.out.println("This is my sorting result: "+myArray);
    }
}
