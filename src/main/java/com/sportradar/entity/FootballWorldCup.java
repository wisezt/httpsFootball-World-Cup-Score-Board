package com.sportradar.entity;

import com.sportradar.service.Service;

public class FootballWorldCup {

    boolean isPlayingGame;

    Service service;

    public FootballWorldCup(Service service){
        this.service = service;
    }


    public boolean gameStart(){
        isPlayingGame = true;

        while(isPlayingGame){

            // initialAGame();
            service.initialAGame(this);

            // display welcomeMessage()
            service.displayWelcomeMessage();

            // Input Home Team Name and Away Team Name
            service.inputTeamsNames();

            // Display the ScoreBoard
            service.displayMatch();

            // Input Home Team Score and Away Team Score
            service.inputScores();

            // Display the ScoreBoard
            service.displayMatch();

            // Display the rank in the scoreboard.
            service.displayRank();

            // whether continue to play the game
            service.choiceForExitingGame();

        }

        System.out.println("Game Over");

        return true;
    }


    public void endGame() {
        isPlayingGame = false;

    }
}
