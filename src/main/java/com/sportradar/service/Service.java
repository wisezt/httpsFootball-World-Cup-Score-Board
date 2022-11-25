package com.sportradar.service;


import com.sportradar.entity.FootballWorldCup;
import com.sportradar.entity.Game;
import com.sportradar.entity.ScoreBoard;

import java.util.Scanner;

public class Service {

        ScoreBoard scoreBoard;

        FootballWorldCup footballWorldCup;

        public ScoreBoard getScoreBoard() {
                return scoreBoard;
        }

        public void setScoreBoard(ScoreBoard scoreBoard) {
                this.scoreBoard = scoreBoard;
        }

        public Game getGame() {
                return game;
        }

        public void setGame(Game game) {
                this.game = game;
        }

        private Game game;

        public Service(ScoreBoard scoreBoard) {
                this.scoreBoard = scoreBoard;
        }


        public void displayWelcomeMessage() {

                scoreBoard.display("Welcome to Football World Cup Score Board Game");

        }

        public void initialAGame() {

                this.game = new Game();
        }

        public void inputTeamsNames() {

                System.out.print("Please Input The name of the Home Team: ");
                Scanner scanner = new Scanner(System.in);
                String homeTeamName = scanner.nextLine().trim();
                while (!isAValidTeamName(homeTeamName) ){
                        homeTeamName = scanner.nextLine();
                }
                game.setHomeTeamName(homeTeamName);

                System.out.print("Please Input The name of the Away Team: ");
                String awayTeamName = scanner.nextLine().trim();
                while (!isAValidTeamName(awayTeamName) ){
                        awayTeamName = scanner.nextLine();
                }
                game.setAwayTeamName(awayTeamName);
        }

        private boolean isAValidTeamName(String teamName) {

                if ( teamName.length()  > 20 ) {
                        System.out.println("--The team name should be no more than 20 characters!--");
                        return false;
                }

                return true;


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
