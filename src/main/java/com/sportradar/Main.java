package com.sportradar;

import com.sportradar.entity.FootballWorldCup;
import com.sportradar.service.Service;

public class Main {
    public static void main(String[] args) {


        FootballWorldCup footballWorldCup = new FootballWorldCup( new Service());

        footballWorldCup.gameStart();



    }
}