package com.sportradar.entity;

import com.sportradar.service.Service;

public class FootballWorldCup {



    Service service;

    public FootballWorldCup(Service service){
        this.service = service;
    }


    public boolean gameStart(){

        System.out.println("This is the Foot World Cup!");


        // display welcomeMessage()
        this.service.displayWelcomeMessage();


        // initialAGame();
        this.service.initialAGame();


        // Input Home Team Name and Away Team Name
        this.service.inputTeamsNames();


        // Display the ScoreBoard
        this.service.displayMatch();


        // Input Home Team Score and Away Team Score
        this.service.inputScores();


        // Display the ScoreBoard
        this.service.displayMatch();



        // Dispaly the rank in the scoreboard.
        this.service.displayRank();


        // whether continue to play the game
        this.service.choiceForExitingGame();


        return true;
    }



}
