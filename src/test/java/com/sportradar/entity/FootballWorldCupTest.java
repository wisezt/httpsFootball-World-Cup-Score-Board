package com.sportradar.entity;

import com.sportradar.Main;
import com.sportradar.service.Service;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FootballWorldCupTest {


    @Test
    public void testGameStart(){

        FootballWorldCup footballWorldCup = mock(FootballWorldCup.class);

        footballWorldCup.gameStart();

        verify(footballWorldCup).gameStart();



    }



}
