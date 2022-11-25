package com.sportradar.service;


import com.sportradar.entity.FootballWorldCup;

public class Service {


        FootballWorldCup footballWorldCup;

        public Service() {


        }

        public Service(FootballWorldCup footballWorldCup) {
                this.footballWorldCup = footballWorldCup;
        }

        public void displayWelcomeMessage() {

                System.out.println("Welcome to the football game");
        }
}
