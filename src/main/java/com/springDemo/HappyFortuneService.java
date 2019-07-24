package com.springDemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Good luck";
    }
}
