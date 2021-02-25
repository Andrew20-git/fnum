package com.company.fusball1;

    public class Torwart extends Spieler {
    private int reaktion ;

    public Torwart(String spielerName, int spielerAlter, int spielerStaerke, int spielerMotivation,int torwardReaktion) {
        super(spielerName,spielerAlter,spielerStaerke,spielerMotivation,0,0);
            this.reaktion = torwardReaktion;
    }

    public int getReaktion () {
        return reaktion;
    }

    public void setReaktion ( int reaktion){
        this.reaktion = reaktion;
    }



    public String toString() {
        String text = "\nName:" + getName();
        text += "\nAlter:" + getAlter();
        text += "\nStaerke:" + getStaerke();
        text += "\nMotivation:" + getMotivation();
        text += "\nreaktion:" + getReaktion();
        return text;
      }
    }

