package com.lidiabazhenova;

public class Main {

    public static void main(String[] args) {
//
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
//
//    }
//
//    private static void printDoubled(ArrayList<Integer> n) {
//        for (int i : n) {
//            System.out.println((Integer) i * 2);
//        }
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team<FootballPlayer> adelaideCrows = new Team("Adeaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beck);

        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseballTeam= new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beck);
        Team<FootballPlayer> melburne = new Team<>("Melburne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melburne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1,1 );

        System.out.println("Rankings");;
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melburne.getName() + ": " + melburne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " :" + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melburne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melburne.compareTo(fremantle));

            }



}
