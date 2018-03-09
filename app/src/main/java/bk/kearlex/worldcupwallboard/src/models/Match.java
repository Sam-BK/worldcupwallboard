package bk.kearlex.worldcupwallboard.src.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by sbeattie-kearley on 19/02/2018.
 */


public class Match {

    private Team homeTeam;
    private Team awayTeam;
    private String stadium;
    private LocalDateTime kickoffTime;
    private ArrayList <Integer> homeGoals;
    private ArrayList <Integer> awayGoals;
    private Group group;



    public Match(Team home, Team away, String venue, LocalDateTime kickoff, Group group){
        homeTeam = home;
        awayTeam = away;
        kickoffTime = kickoff;
        stadium = venue;
        this.group = group;
    }

    // Getters

    public Team getHomeTeam(){return homeTeam;}

    public Team getAwayTeam(){ return awayTeam;}

    public ArrayList<Integer> getHomeGoals(){return homeGoals;}

    public ArrayList<Integer> getAwayGoals(){return awayGoals;}

    public String getStadium(){return stadium;}

    public LocalDateTime getKickoffTime(){return kickoffTime;}

    public Group getGroup() {
        return group;
    }

    // Setters


    public void setKickoffTime(LocalDateTime kickoffTime) {
        this.kickoffTime = kickoffTime;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setHomeTeam(Team homeTeam){
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setGroup(Group gameStage) {
        group = gameStage;
    }

    // public methods

    public void addScore(ArrayList<Integer> homeGoals, ArrayList<Integer> awayGoals){
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;

        updateTeams();
        //updateGroup();

    }

    private void updateTeams(){
        homeTeam.addResult(homeGoals.size(),awayGoals.size());
        awayTeam.addResult(awayGoals.size(),homeGoals.size());
    }

//    private void updateGroup(){
//
//        }
}
