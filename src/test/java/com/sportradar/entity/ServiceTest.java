package com.sportradar.entity;

import com.sportradar.service.Service;
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

        service.initialAGame(footballWorldCup);

        ByteArrayInputStream in = new ByteArrayInputStream("Singapore\nChina\n".getBytes());
        System.setIn(in);



        service.displayWelcomeMessage();
        verify(service).displayWelcomeMessage();
        service.inputTeamsNames();

        in = new ByteArrayInputStream("10\n20\n".getBytes());
        System.setIn(in);
        service.inputScores();
        verify(service).inputScores();

        in = new ByteArrayInputStream("N".getBytes());
        System.setIn(in);
        service.choiceForExitingGame();

        service.displayRank();
        verify(service).displayRank();


        verify(service).initialAGame(footballWorldCup);

        service.displayMatch();
        verify(service).displayMatch();

    }

    @Test
    public void testServiceDisplayMethodWithScoreBoard() {

        ScoreBoard scoreBoard = mock(ScoreBoard.class);
        Service service = new Service(scoreBoard);

        FootballWorldCup footballWorldCup = new FootballWorldCup(service);

        service.displayWelcomeMessage();

        verify(scoreBoard).display("Welcome to Football World Cup Score Board Game");

    }



    @Test
    public void testInputTeamsNames(){


        Service service = new Service(new ScoreBoard());

        FootballWorldCup footballWorldCup = new FootballWorldCup(service);

        service.initialAGame(footballWorldCup);

        ByteArrayInputStream in = new ByteArrayInputStream("Singapore\nChina".getBytes());
        System.setIn(in);

        service.inputTeamsNames();


        assertEquals("Singapore", service.getGame().getHomeTeamName());
        assertEquals("China", service.getGame().getAwayTeamName());


    }

    @Test
    public void testInputTeamsScores(){


        Service service = new Service(new ScoreBoard());

        FootballWorldCup footballWorldCup = new FootballWorldCup(service);

        service.initialAGame(footballWorldCup);

        ByteArrayInputStream in = new ByteArrayInputStream("10\n20".getBytes());
        System.setIn(in);

        service.inputScores();


        assertEquals(10, service.getGame().getHomeTeamScore());
        assertEquals(20, service.getGame().getAwayTeamScore());


    }


}
