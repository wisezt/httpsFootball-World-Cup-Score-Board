package com.sportradar.service;


import com.sportradar.entity.FootballWorldCup;
import com.sportradar.entity.Game;
import com.sportradar.entity.Records;
import com.sportradar.entity.ScoreBoard;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Service {

        ScoreBoard scoreBoard;

        FootballWorldCup footballWorldCup;

        Records records;

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

        public void initialAGame(FootballWorldCup footballWorldCup) {

                this.game = new Game();
                this.records = new Records();
                this.footballWorldCup = footballWorldCup;

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
                scoreBoard.displayMatch(game);
        }

        public void inputScores() {

                System.out.print("Please Input the Home Team Score: ");
                Scanner scanner = new Scanner(System.in);
                String homeTeamScoreStr = scanner.nextLine();
                while(!isAValidScoreStr(homeTeamScoreStr)){
                        homeTeamScoreStr = scanner.nextLine();
                }
                game.setHomeTeamScore(Integer.parseInt(homeTeamScoreStr));

                System.out.print("Please Input the Away Team Score: ");
                String awayTeamScore = scanner.nextLine();
                while(!isAValidScoreStr(homeTeamScoreStr)){
                        awayTeamScore = scanner.nextLine();
                }
                game.setAwayTeamScore(Integer.parseInt(awayTeamScore));


                records.add(game);
        }

        private boolean isAValidScoreStr(String scoreStr) {
                int score;
                try {
                        score = Integer.parseInt(scoreStr);

                        if ( score < 0 || score >=100) {
                                System.out.println("--Please input a score between 0 to 99--");
                                return false;
                        }

                        return true;
                }
                catch (NumberFormatException e) {
                        System.out.println("--Please input a score between 0 to 99--");
                }

                return false;
        }

        public void choiceForExitingGame() {
                System.out.print("Would you like to play another round: (Y/N)");
                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();
                while(!isAValidChoice(choice)){
                        choice = scanner.nextLine();
                }
                if ( choice.toUpperCase().trim().equals("N") ) {
                        footballWorldCup.endGame();
                }

        }

        private boolean isAValidChoice(String choice) {
                String choiceUpCase = choice.toUpperCase().trim();
                if ( choiceUpCase.equals("Y") || choiceUpCase.equals("N") ) {
                        return true;

                }
                System.out.println("--Please input \"Y\" or \"N\"--");
                return false;

        }

        public void displayRank(){

                List<Game> list = getTop10(records);

                scoreBoard.displayRank(list);

        }

        private List<Game> getTop10(Records records) {

                return records.getList()
                        .stream()
                        .sorted(Comparator.comparing(Game::getTotalScore).thenComparing(Game::getTimeStamp).reversed()
                        )
                        .limit(10)
                        .collect(Collectors.toList());

        }

}
