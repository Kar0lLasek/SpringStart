package com.springDemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Do 30 minutrs run";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
