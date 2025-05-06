/**
 * Author Name: James F.
 * Date: 5/06/25
 * File Name: Game.java
 * Last Update: 5/06/25 by James F.
 * Program Description: Class that contains methods and information for a game.
 */


/*
============= CHANGE LOG =============
James F. - 5/06/25 - added variables, constructors, and gets/sets.


======================================
 */

public class Game {
    int gameID;
    int homeTeam;
    int awayTeam;
    int dateOfGame;
    int winningTeam;
    String venueCity;
    String venueState;
    
    public Game(int gameID, int homeTeam, int awayTeam, int dateOfGame) {
        this.gameID = gameID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.dateOfGame = dateOfGame;
        winningTeam = 0;
        venueCity = "";
        venueState = "";
    }
    public Game(int gameID, int homeTeam, int awayTeam, int dateOfGame, int winningTeam, String venueCity, String venueState) {
        this.gameID = gameID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.dateOfGame = dateOfGame;
        this.winningTeam = winningTeam;
        this.venueCity = venueCity;
        this.venueState = venueState;
    }
    
    
    // ============= Getters / Setters =============
    // == gameID ==
    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    
    // == homeTeam ==
    public int getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(int homeTeam) {
        this.homeTeam = homeTeam;
    }

    
    // == awayTeam ==
    public int getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(int awayTeam) {
        this.awayTeam = awayTeam;
    }

    
    // == dateOfGame ==
    public int getDateOfGame() {
        return dateOfGame;
    }

    public void setDateOfGame(int dateOfGame) {
        this.dateOfGame = dateOfGame;
    }

    
    // == winningTeam ==
    public int getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(int winningTeam) {
        this.winningTeam = winningTeam;
    }

    
    // == venueCity ==
    public String getVenueCity() {
        return venueCity;
    }

    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    
    // == venueState ==
    public String getVenueState() {
        return venueState;
    }

    public void setVenueState(String venueState) {
        this.venueState = venueState;
    }
}

