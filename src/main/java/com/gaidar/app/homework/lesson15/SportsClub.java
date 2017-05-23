package com.gaidar.app.homework.lesson15;

/**
 * Created by Nata on 5/12/2017.
 */
public abstract class SportsClub {
    String clubName;
    String location;
    String statistic;

    public void showName(){
        System.out.println(this.clubName);

    };
    public void showLocation(){
        System.out.println(this.location);

    };
    public void showStatistic(){
        System.out.println(clubName + " club: Wins: "+ wins() + "; Draws: " + draws() + "; Loses: " + defeats());

    };
    public abstract int wins();

    public abstract int draws();
    public abstract int defeats();

}
