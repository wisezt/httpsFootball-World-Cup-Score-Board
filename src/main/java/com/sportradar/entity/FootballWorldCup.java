package com.sportradar.entity;

import com.sportradar.service.Service;

public class FootballWorldCup {



    Service service;

    public FootballWorldCup(Service service){
        this.service = service;
    }


    public boolean gameStart(){

        System.out.println("The is the Foot World Cup!");


        // display welcomeMessage()
        service.displayWelcomeMessage();


        // initialAGame();
        service.initialAGame();


        // Input Home Team Name and Away Team Name
        service.inputTeamsNames();


        // Display the ScoreBoard
        service.displayMatch();


        // Input Home Team Score and Away Team Score
        service.inputScores();


        // Display the ScoreBoard
        service.displayMatch();



        // Dispaly the rank in the scoreboard.
        service.displayRank();


        // whether continue to play the game
        service.choiceForExitingGame();


        return true;
    }



}
