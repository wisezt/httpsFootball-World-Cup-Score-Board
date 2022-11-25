package com.sportradar.service;


import com.sportradar.entity.FootballWorldCup;
import com.sportradar.entity.ScoreBoard;

public class Service {

        ScoreBoard scoreBoard;

        FootballWorldCup footballWorldCup;

        public Service(ScoreBoard scoreBoard) {
                this.scoreBoard = scoreBoard;
        }


        public void displayWelcomeMessage() {

                scoreBoard.display("Welcome to Football World Cup Score Board Game");

        }

        public void initialAGame() {
        }

        public void inputTeamsNames() {
        }

        public void displayMatch() {
        }

        public void inputScores() {
        }

        public void choiceForExitingGame() {
        }

        public void displayRank() {
        }
}
