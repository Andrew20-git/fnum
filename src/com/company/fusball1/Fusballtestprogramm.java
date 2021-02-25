package com.company.fusball1;

import java.util.ArrayList;

public class Fusballtestprogramm {
    public static void main(String[] args) {
        Trainer trainer1 =new Trainer("mklaus meier",44,7);
        Spieler spieler1 = new Spieler ("dirk kabeltraum", 19,22,89,9,2);
        Spieler spieler2 = new Spieler ("karl heinz", 20,45,50,3,1);
        Spieler spieler3 = new Spieler ("olaf maler", 30,76,40,4,1);
        Spieler spieler4 = new Spieler ("abdi dürum", 25,69,56,6,0);
        Spieler spieler5 = new Spieler ("mustafa binladen", 22,62,43,3,1);
        Spieler spieler6 = new Spieler ("kevin gerken", 23,48,29,1,0);
        Spieler spieler7 = new Spieler ("torben istaman", 25,79,76,12,7);
        Spieler spieler8 = new Spieler ("sebastian kiebrecht", 20,49,89,10,4);
        Spieler spieler9 = new Spieler ("luca olgarto", 26,52,49,4,1);
        Spieler spieler10= new Spieler ("dieter fullman", 19,39,58,7,3);
        Torwart torwart1 = new Torwart("manuel herman",21,80,55,90);
        System.out.println(torwart1);
        System.out.println(trainer1);
        System.out.println(spieler1);
        ArrayList spielerliste = new ArrayList<Spieler>();
        spielerliste.add(spieler1,spieler2,spieler3,spieler4,spieler5,spieler6,spieler7,spieler8,spieler9,spieler10,torwart1);
        Mannschaft mannschaftH = new Mannschaft("Huchtinger Hölunde", trainer1, torwart1, spielerliste );


    }
}
