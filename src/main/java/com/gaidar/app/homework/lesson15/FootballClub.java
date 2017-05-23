package com.gaidar.app.homework.lesson15;

/**
 * Created by Nata on 5/12/2017.
 */
public class FootballClub extends SportsClub{
    private int wins;
    private int draws;
    private int defeats;

    @Override
    public int wins() {
        return wins;
    }

    @Override
    public int draws() {
        return draws;
    }

    @Override
    public int defeats() {
        return defeats;
    }

    public String getClubName(){
        return clubName;
    }

    public String getLocation(){
        return location;
    }


    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWins(int wins) {
        this.wins = wins;

    }
    public void setDraws(int draws) {
        this.draws = draws;

    }
    public void setDefeats(int defeats) {
        this.defeats = defeats;

    }
}
