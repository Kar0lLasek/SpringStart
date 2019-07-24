package com.springDemo;

import java.util.Random;

public class NewFortuneService implements FortuneService {

    String [] tab = new String[3];

    public NewFortuneService() {
        tab[0] = "Good luck";
        tab[1] = "GG guys";
        tab[2] = "Nice work";
    }

    @Override
    public String getFortune() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);
        //System.out.println("Random number is = " + randomInt);
        return tab[randomInt];
    }
}
