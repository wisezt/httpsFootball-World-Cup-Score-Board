package com.sportradar.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Game {


    private String awayTeamName;
    private String id;

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    private LocalDateTime timeStamp;

    String homeTeamName;



    int homeTeamScore;

    int awayTeamScore;


    public Game(){
        this.id = UUID.randomUUID().toString();
        this.homeTeamScore = 0;
        this.awayTeamScore = 0;
        this.timeStamp = LocalDateTime.now();
    }

    public Game(String homeTeamName,  int homeTeamScore, String awayTeamName, int awayTeamScore) {
        this.id = UUID.randomUUID().toString();
        this.homeTeamName = homeTeamName;
        this.awayTeamName = awayTeamName;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
        this.timeStamp = LocalDateTime.now();

    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public int getTotalScore(){
        return homeTeamScore + awayTeamScore;
    }



    public void setHomeTeamName(String homeTeamName) {

        this.homeTeamName = homeTeamName;

    }

    public void setAwayTeamName(String awayTeamName) {

        this.awayTeamName = awayTeamName;

    }

    public void setHomeTeamScore(int homeTeamScore) {

        this.homeTeamScore = homeTeamScore;

    }

    public void setAwayTeamScore(int awayTeamScore) {

        this.awayTeamScore = awayTeamScore;

    }


}
