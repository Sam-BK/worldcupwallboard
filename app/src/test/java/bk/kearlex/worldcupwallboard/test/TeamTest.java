package bk.kearlex.worldcupwallboard.test;

import org.junit.Before;
import org.junit.Test;
import bk.kearlex.worldcupwallboard.src.models.Team;

import static org.junit.Assert.*;

/**
 * Created by sbeattie-kearley on 07/03/2018.
 */
public class TeamTest {

    private Team team1;

    @Before
    public void setup() throws Exception {
        team1 = new Team("testTeam");
    }

    @Test
    public void addWinResult() throws Exception {
        //Team1
        team1.addResult(2,1);
        assertTrue(team1.getGoalsConceded() == 1);
        assertTrue(team1.getGoalsScored() == 2);
        assertTrue(team1.getPoints() == 3);
        assertTrue(team1.getGoalDifference() == 1);
        assertTrue(team1.getWins() == 1);

    }

    @Test
    public void addDrawResult() throws Exception {
        team1.addResult(1,1);
        assertTrue(team1.getGoalsConceded() == 1);
        assertTrue(team1.getGoalsScored() == 1);
        assertTrue(team1.getPoints() == 1);
        assertTrue(team1.getGoalDifference() == 0);
        assertTrue(team1.getDraws() == 1);
    }

    @Test
    public void addLossResult() throws Exception {
        team1.addResult(1,2);
        assertTrue(team1.getGoalsConceded() == 2);
        assertTrue(team1.getGoalsScored() == 1);
        assertTrue(team1.getPoints() == 0);
        assertTrue(team1.getGoalDifference() == -1);
        assertTrue(team1.getLosses() == 1);

    }

    @Test
    public void updateGamesPlayed() throws Exception{
        team1.addResult(2,1);
        team1.addResult(1,1);
        team1.addResult(3,1);
        assertTrue(team1.getGamesPlayed() == 3);
    }
}