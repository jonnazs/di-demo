package com.jonnazs.didemo.controllers;

import com.jonnazs.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;
import java.text.DateFormatSymbols;
import java.util.*;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("My Date says: "+ getDay("9", "3", "2018"));

        return greetingService.sayGreeting();
    }
    public String getDay(String day, String month, String year) {
/*
            int yy,mm,dd;
            yy = Integer.parseInt(year);
            mm= Integer.parseInt(month);
            dd = Integer.parseInt(day);
            java.time.LocalDate ld = java.time.LocalDate.of(yy,mm,dd);
            return ld.getDayOfWeek().toString();*/


        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String weekdays[] = dfs.getWeekdays();

        Calendar cal = new GregorianCalendar(Locale.US);
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        short q =8;
        short t = 9;
        int b = q+t;
        System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
        return weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }
}
