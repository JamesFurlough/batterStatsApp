/**
 * Author Name: James F.
 * Date: 4/22/25
 * File Name: Batter.java
 * Last Update: 4/29/25 by James F.
 * Program Description: Class that contains methods and information for a batter.
 */

/*
============= CHANGE LOG =============
James F. - 4/22/25 - added variables, constructors, and gets/sets.
James F. - 4/29/2025 - changed variables to match database, a constructor with the not null database variables,

======================================
 */

package com.batterteam.main;

public class Batter {
    // variables
    String playerFirstName;
    String playerLastName;
    String teamName;
    String playerPosition;
    int atBatsAmount;
    int hitsAmount;
    int runsAmount;
    int strikeOutsAmount;
    int runsBattedIn;
    int baseOnBallsAmount;
    int assistsAmount;
    int putOutAmount;
    int homeRunAmount;
    int homePlateAmount;
    int sacrificeFlyAmount;
    int sacrificeBuntAmount;
    int stolenBaseAttemptAmount;
    double onBasePercent;
    double battingAverage;
    

    
    // constructors
    public Batter(String name) {
        playerFirstName = name.split(" ")[0];
        playerLastName = name.split(" ")[1];
        teamName = "";
        atBatsAmount = 0;
        hitsAmount = 0;
        runsAmount = 0;
        strikeOutsAmount = 0;
        runsBattedIn = 0;
        baseOnBallsAmount = 0;
        assistsAmount = 0;
        putOutAmount = 0;
        homeRunAmount = 0;
        homePlateAmount = 0;
        sacrificeFlyAmount = 0;
        sacrificeBuntAmount = 0;
        stolenBaseAttemptAmount = 0;
        onBasePercent = 0;
        battingAverage = 0;
    }
    public Batter(String name, String team, String position) {
        playerFirstName = name.split(" ")[0];
        playerLastName = name.split(" ")[1];
        teamName = team;
        playerPosition = position;
        atBatsAmount = 0;
        hitsAmount = 0;
        runsAmount = 0;
        strikeOutsAmount = 0;
        runsBattedIn = 0;
        baseOnBallsAmount = 0;
        assistsAmount = 0;
        putOutAmount = 0;
        homeRunAmount = 0;
        homePlateAmount = 0;
        sacrificeFlyAmount = 0;
        sacrificeBuntAmount = 0;
        stolenBaseAttemptAmount = 0;
        onBasePercent = 0;
        battingAverage = 0;
    }
    public Batter(String name, String team, String position, int ab, int h, int r, int bob, int ast, int po, int hr, int hp, int so, int sf, int sb, int sba, int obp, int rbi) {
        playerFirstName = name.split(" ")[0];
        playerLastName = name.split(" ")[1];
        teamName = team;
        atBatsAmount = ab;
        hitsAmount = h;
        runsAmount = r;
        strikeOutsAmount = so;
        runsBattedIn = rbi;
        baseOnBallsAmount = bob;
        assistsAmount = ast;
        putOutAmount = po;
        homeRunAmount = hr;
        homePlateAmount = hp;
        sacrificeFlyAmount = sf;
        sacrificeBuntAmount = sb;
        stolenBaseAttemptAmount = sba;
        onBasePercent = obp;
        updateBattingAverage();
    }

    
    
    // gets
    public String getFirstName() {
        return playerFirstName;
    }
    
    public String getLastName() {
        return playerLastName;
    }
    
    public String getTeam() {
        return teamName;
    }
    
    public String getPosition() {
        return playerPosition;
    }
    
    public int getAtBatsAmount() {
        return atBatsAmount;
    }
        public int getHitsAmount() {
        return hitsAmount;
    }

    public int getRunsAmount() {
        return runsAmount;
    }

    public int getStrikeOutsAmount() {
        return strikeOutsAmount;
    }

    public int getRunsBattedIn() {
        return runsBattedIn;
    }

    public int getBaseOnBallsAmount() {
        return baseOnBallsAmount;
    }

    public int getAssistsAmount() {
        return assistsAmount;
    }

    public int getPutOutAmount() {
        return putOutAmount;
    }

    public int getHomeRunAmount() {
        return homeRunAmount;
    }

    public int getHomePlateAmount() {
        return homePlateAmount;
    }

    public int getSacrificeFlyAmount() {
        return sacrificeFlyAmount;
    }

    public int getSacrificeBuntAmount() {
        return sacrificeBuntAmount;
    }

    public int getStolenBaseAttemptAmount() {
        return stolenBaseAttemptAmount;
    }

    public double getOnBasePercent() {
        return onBasePercent;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    
    // sets
    public void updateBattingAverage() {
        battingAverage = (double) hitsAmount / atBatsAmount;
    }
    
    public void setName(String name) {
        playerFirstName = name.split(" ")[0];
        playerLastName = name.split(" ")[1];
    }
    
    public void setTeam(String team) {
        teamName = team;
    }
    
    public void setPosition(String position) {
        playerPosition = position;
    }
    
    public void setAtBats(int ab) {
        atBatsAmount = ab;
    }
    
    public void setHitsAmount(int hitsAmount) {
        this.hitsAmount = hitsAmount;
    }

    public void setRunsAmount(int runsAmount) {
        this.runsAmount = runsAmount;
    }

    public void setStrikeOutsAmount(int strikeOutsAmount) {
        this.strikeOutsAmount = strikeOutsAmount;
    }

    public void setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public void setBaseOnBallsAmount(int baseOnBallsAmount) {
        this.baseOnBallsAmount = baseOnBallsAmount;
    }

    public void setAssistsAmount(int assistsAmount) {
        this.assistsAmount = assistsAmount;
    }

    public void setPutOutAmount(int putOutAmount) {
        this.putOutAmount = putOutAmount;
    }

    public void setHomeRunAmount(int homeRunAmount) {
        this.homeRunAmount = homeRunAmount;
    }

    public void setHomePlateAmount(int homePlateAmount) {
        this.homePlateAmount = homePlateAmount;
    }

    public void setSacrificeFlyAmount(int sacrificeFlyAmount) {
        this.sacrificeFlyAmount = sacrificeFlyAmount;
    }

    public void setSacrificeBuntAmount(int sacrificeBuntAmount) {
        this.sacrificeBuntAmount = sacrificeBuntAmount;
    }

    public void setStolenBaseAttemptAmount(int stolenBaseAttemptAmount) {
        this.stolenBaseAttemptAmount = stolenBaseAttemptAmount;
    }

    public void setOnBasePercent(double onBasePercent) {
        this.onBasePercent = onBasePercent;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }
    
    // print
}
