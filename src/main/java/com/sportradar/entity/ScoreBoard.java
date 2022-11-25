package com.sportradar.entity;

import java.util.List;
import java.util.stream.IntStream;

public class ScoreBoard {

    public void displayMatch(Game game) {

        display(game.getHomeTeamName() + ": " +game.getHomeTeamScore() + " - " + game.getAwayTeamName() + ": " + game.getAwayTeamScore());


        IntStream.range(0,30).forEach(x -> System.out.print("*"));
        System.out.print("Football World Cup Score Board");
        IntStream.range(0,30).forEach(x -> System.out.print("*"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(game.getHomeTeamName() + ": " +game.getHomeTeamScore() + "\t-\t" + game.getAwayTeamName() + ": " + game.getAwayTeamScore());
        System.out.println();
        System.out.println();
        IntStream.range(0,"Football World Cup Score Board".length()+60).forEach(x -> System.out.print("*"));
        System.out.println();
    }


    public void displayRank(List<Game> list) {

        String title = "Football World Cup Score Board";

        System.out.print("\n\n\n");
        IntStream.range(0,30).forEach(x -> System.out.print("*"));
        System.out.print(title);
        IntStream.range(0,30).forEach(x -> System.out.print("*"));
        System.out.println();

        for(Game game: list){
            String tmp = game.getHomeTeamName() + ": " + game.getHomeTeamScore() + " - " + game.getAwayTeamName() + " : " + game.getAwayTeamScore();
            System.out.print("*");
            IntStream.range(0,(title.length() + 60 -2 - tmp.length() )/2).forEach(x -> System.out.print(" "));
            System.out.print(tmp);
            IntStream.range(0,(title.length() + 60 -2 -tmp.length()+1)/2).forEach(x -> System.out.print(" "));
            System.out.println("*");
        }



        IntStream.range(0,title.length() + 60).forEach(x -> System.out.print("*"));
        System.out.println();


    }

    public void display(String s) {

        String title = "Football World Cup Score Board";

        System.out.print("\n\n\n");
        IntStream.range(0,30).forEach(x -> System.out.print("*"));
        System.out.print(title);
        IntStream.range(0,30).forEach(x -> System.out.print("*"));
        System.out.println();
        IntStream.range(0,4).forEach(x -> {
            System.out.print("*");
            IntStream.range(0,title.length()+60-2).forEach(y -> System.out.print(" "));
            System.out.println("*");
        });
        System.out.print("*");
        IntStream.range(0,(title.length() + 60 -2 - s.length())/2).forEach(x -> System.out.print(" "));
        System.out.print(s);
        IntStream.range(0,(title.length() + 60 -2 - s.length() + 1)/2).forEach(x -> System.out.print(" "));
        System.out.println("*");
        IntStream.range(0,4).forEach(x -> {
            System.out.print("*");
            IntStream.range(0,title.length()+60-2).forEach(y -> System.out.print(" "));
            System.out.println("*");
        });

        IntStream.range(0,title.length() + 60).forEach(x -> System.out.print("*"));
        System.out.println();

    }


}
