package com.company.fusball1;

public class Spieler extends Person {

    private int staerke ;
    private int torschuss ;
    private int motivation;
    private int tore;


    public Spieler(String spielerName, int spielerAlter , int spielerStaerke, int spielerMotivation, int spielerTorschuss, int spielerTore) {
        super(spielerName, spielerAlter);

        this.staerke = spielerStaerke;
        this.motivation = spielerMotivation;
        this.torschuss = spielerTorschuss;
        this.tore = spielerTore;
    }
        public int getStaerke() {
        return staerke;
    }
        public void setStaerke(int staerke){
        this.staerke = staerke;
    }

        public int getMotivation() {
        return motivation;
    }
        public void setMotivation(int motivation){
        this.motivation = motivation;
    }

        public int getTorschuss() {
        return torschuss;
    }
        public void setTorschuss (int Torschuss){
        this.torschuss = torschuss;
    }

        public int getTore() {
        return tore;
    }
        public void setTore (int Tore){
        this.tore = tore;
    }

       public String toString() {
        String text = "\nName:" +getName();
        text += "\nAlter:" +getAlter();
        text += "\nStaerke:" +getStaerke();
        text += "\nMotivation:" +getMotivation();
        text += "\nTorschuss:" +getTorschuss();
        text += "\nTore:" +getTore();
        return text;
    }
}







