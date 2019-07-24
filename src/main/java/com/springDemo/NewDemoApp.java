package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewDemoApp {

    public static void main(String[] args){
        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());*/

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("mySuperCoach", CricketCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());



    }

}
