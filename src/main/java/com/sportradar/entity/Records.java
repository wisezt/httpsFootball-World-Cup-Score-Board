package com.sportradar.entity;

import java.util.ArrayList;
import java.util.List;

public class Records {

    public List<Game> getList() {
        return list;
    }

    public void setList(List<Game> list) {
        this.list = list;
    }

    List<Game> list ;

    public Records() {
        this.list = new ArrayList<>();
        list.add(new Game("Mexico", 0, "Canada", 5));
        list.add(new Game("Spain", 10, "Brazil", 2));
        list.add(new Game("Germany", 2, "France:", 2));
        list.add(new Game("Uruguay", 6, "Italy:", 6));
        list.add(new Game("Argentina", 3, "Australia:", 1));
    }

    public void add(Game game) {
        list.add(game);

    }
}
