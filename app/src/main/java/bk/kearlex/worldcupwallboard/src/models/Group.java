package bk.kearlex.worldcupwallboard.src.models;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;

/**
 * Created by sbeattie-kearley on 17/02/2018.
 */

public class Group {
    private Helper.GameStage name;

    private ArrayList<Team> teams;
    private List<Match> games;

    private Team first;
    private Team second;
    private Team third;
    private Team fourth;

    public Group(Team team1, Team team2, Team team3, Team team4, Helper.GameStage name,
                 Match match1, Match match2, Match match3, Match match4, Match match5, Match match6) {

        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);
        this.name = name;
        games.add(match1);
        games.add(match2);
        games.add(match3);
        games.add(match4);
        games.add(match5);
        games.add(match6);
        // Set to seeded group positions.
        first = team1;
        second = team2;
        third = team3;
        fourth = team4;

    }

    // Getters

    public Helper.GameStage getName() {
        return name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public List<Match> getGames() {
        return games;
    }

    public Team getFirst() {
        return first;
    }

    public Team getSecond() {
        return second;
    }

    public Team getThird() {
        return third;
    }

    public Team getFourth() {
        return fourth;
    }

    // Private methods

    private void calculatePositions() {

        LinkedHashSet initialPositions = new LinkedHashSet<>(4);
        initialPositions.add(first);
        initialPositions.add(second);
        initialPositions.add(third);
        initialPositions.add(fourth);






    }
}
