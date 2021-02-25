package com.company.fusball1;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste; // Auch hierfür Getter und Setter

    public Mannschaft(String mannschaftName,Trainer mannschaftTrainer,Torwart mannschaftTorwart, ArrayList mannschaftSpielerliste){
      this.name = mannschaftName;
      this.trainer = mannschaftTrainer;
      this.torwart = mannschaftTorwart;
      this.spielerliste = mannschaftSpielerliste;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }
    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }
    public void setTorwart(Torwart torwart){
        this.torwart = torwart;
    }


    //public setSpielerliste(spielerliste ArrayList<Spieler>) {
        //this.spielerliste = spielerliste;
    }







    //public int getStaerke(){return staerke;}//array list java auslesen

}
