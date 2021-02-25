package Obst;

public class Banane {

    private String name = "meine krumme banane";
    private double gewicht = 120.5;
    private double vitaminc  ;

     public Banane (double bananenGewicht , String bananenName,double bananeVitamincgehalt) {
         this.name = bananenName;
         this.gewicht = bananenGewicht;
         this.vitaminc = bananeVitamincgehalt;
     }
         public String getName(){
             return name;
         }
         public double getGewicht(){
             return gewicht;
         }
         public double getVitaminc(){
         return vitaminc;
         }
         public void setGewicht(double gewicht){
             this.gewicht = gewicht;
         }

    }



