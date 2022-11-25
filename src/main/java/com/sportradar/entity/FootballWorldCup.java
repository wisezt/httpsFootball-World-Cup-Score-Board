package com.sportradar.entity;

import com.sportradar.service.Service;

public class FootballWorldCup {

    public FootballWorldCup(){

    }


    public boolean gameStart(){

        System.out.println("The is the Foot World Cup!");

        // Register a service
        Service service = new Service(this);


        // display welcomeMessage()
        service.displayWelcomeMessage();


        // initialAGame();


        // Input Home Team Name and Away Team Name


        // Display the ScoreBoard


        // Input Home Team Score and Away Team Score


        // Display the ScoreBoard


        // Dispaly the rank in the scoreboard.


        // whether continue to play the game


        return true;
    }



}
