package com.company.fusball1;

public class Trainer extends Person {
    private int erfahrung ;



 public Trainer (String trainerName , int trainerAlter ,int trainerErfahrung) {
     super(trainerName,trainerAlter);

     this.erfahrung = trainerErfahrung;
 }

    public int getErfahrung() {
     return erfahrung;
 }

    public void setErfahrung(int erfahrung){
     this.erfahrung = erfahrung;
 }

     public String toString() {
        String text = "\nName:" +getName();
        text += "\nAlter:" +getAlter();
        text += "\nErfahrung:" +getErfahrung();
        return text;
     }
}



