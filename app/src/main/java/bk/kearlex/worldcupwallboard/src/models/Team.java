package bk.kearlex.worldcupwallboard.src.models;

/**
 * Created by sbeattie-kearley on 18/02/2018.
 */

public class Team {

    private String teamName;
    private int goalsScored;
    private int goalsConceded;
    private int goalDifference;
    private int points;
    private int wins;
    private int losses;
    private int draws;
    private int gamesPlayed;


    // Constructors

    public Team(String name){
        teamName = name;
        goalsScored = 0;
        goalsConceded = 0;
        goalDifference = 0;
        points = 0;


    }

    // Getters

    public String getTeamName() {
        return teamName;
    }

    public int getGoalsScored(){
        return goalsScored;
    }

    public int getGoalsConceded() { return goalsConceded;}

    public int getGoalDifference(){
        return goalDifference;
    }

    public int getPoints() {
        return points;
    }

    public int getGamesPlayed(){ return gamesPlayed;}

    public int getWins(){ return wins;}

    public int getDraws() {
        return draws;
    }

    public int getLosses() {

        return losses;
    }
    // Public Methods//

    public void addResult(int scored, int conceded){
        goalsScored += scored;
        goalsConceded += conceded;

        if (scored > conceded){
            points += 3;
            wins ++;
        }
        else if(scored == conceded){
            points += 1;
            draws ++;
        }
        else{
            losses ++;
        }

        updateGamesPlayed();
        updateGoalDifference();
    }

    // Private Methods //

    private void updateGoalDifference(){
        goalDifference = goalsScored - goalsConceded;
    }

    private void updateGamesPlayed(){gamesPlayed = wins + losses + draws;}
}