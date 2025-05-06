/**
 * Author Name: James F.
 * Date: 5/06/25
 * File Name: Team.java
 * Last Update: 5/06/25 by James F.
 * Program Description: Class that contains methods and information for a team.
 */


/*
============= CHANGE LOG =============
James F. - 5/06/25 - added variables, constructors, and gets/sets.


======================================
 */

public class Team {
    int teamID;
    String teamName;
    int teamWins;
    int teamLosses;
    
    public Team(int teamID, String teamName) {
        this.teamID = teamID;
        this.teamName = teamName;
        teamWins = 0;
        teamLosses = 0;
    }
    public Team(int teamID, String teamName, int teamWins, int teamLosses) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.teamWins = teamWins;
        this.teamLosses = teamLosses;
    }
    
    
    // ============= Getters / Setters =============
    // == teamID ==
    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    
    // == teamName ==
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    
    // == teamWins ==
    public int getTeamWins() {
        return teamWins;
    }

    public void setTeamWins(int teamWins) {
        this.teamWins = teamWins;
    }

    
    // == teamLosses ==
    public int getTeamLosses() {
        return teamLosses;
    }

    public void setTeamLosses(int teamLosses) {
        this.teamLosses = teamLosses;
    }
}
