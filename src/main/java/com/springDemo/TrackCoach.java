package com.springDemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it!" + fortuneService.getFortune();
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
