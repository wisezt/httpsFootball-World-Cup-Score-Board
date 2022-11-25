package com.sportradar.entity;

import com.sportradar.service.Service;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ServiceTest {


    @Test
    public void testServiceMethodHasBeenCalled(){

        Service service = mock(Service.class);

        FootballWorldCup footballWorldCup = new FootballWorldCup(service);

        footballWorldCup.gameStart();

        verify(service).displayWelcomeMessage();
        verify(service).displayRank();
        verify(service).initialAGame();
        verify(service, times(2)).displayMatch();
        verify(service).inputScores();
        verify(service).inputTeamsNames();
        verify(service).choiceForExitingGame();



    }
}
