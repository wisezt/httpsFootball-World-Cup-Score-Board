package com.sportradar.entity;

import com.sportradar.service.Service;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {


    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }




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

    @Test
    public void testServiceDisplayMethodWithScoreBoard() {

        ScoreBoard scoreBoard = mock(ScoreBoard.class);
        Service service = new Service(scoreBoard);

        FootballWorldCup footballWorldCup = new FootballWorldCup(service);

        footballWorldCup.gameStart();

        verify(scoreBoard).display("Welcome to Football World Cup Score Board Game");

    }



    @Test
    public void testInputTeamsNames(){


        Service service = new Service(new ScoreBoard());

        service.initialAGame();

        ByteArrayInputStream in = new ByteArrayInputStream("Singapore\nChina".getBytes());
        System.setIn(in);

        service.inputTeamsNames();


        assertEquals("Singapore", service.getGame().getHomeTeamName());
        assertEquals("China", service.getGame().getAwayTeamName());


    }

    @Test
    public void testInputTeamsScores(){


        Service service = new Service(new ScoreBoard());

        service.initialAGame();

        ByteArrayInputStream in = new ByteArrayInputStream("10\n20".getBytes());
        System.setIn(in);

        service.inputScores();


        assertEquals(10, service.getGame().getHomeTeamScore());
        assertEquals(20, service.getGame().getAwayTeamScore());


    }


}
