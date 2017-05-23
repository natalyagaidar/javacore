package com.gaidar.runners.homework.lesson15;

import com.gaidar.app.homework.lesson15.FootballClub;
import com.gaidar.app.homework.lesson15.SportsClub;

/**
 * Created by Nata on 5/21/2017.
 */
public class SportClubRunner {
    public static void main(String[] args) {
        FootballClub club1 = new FootballClub();
        club1.setClubName("Clubname1");
        club1.setLocation("38° 53′ 35″ N");
        club1.setWins(9);
        club1.setDraws(1);
        club1.setDefeats(5);
        club1.showStatistic();
        club1.showLocation();

    }
}
