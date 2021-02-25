package Obst;

public class Apfle {private String name = "mein runder apfel";
    private double gewicht = 120.5;
    private double vitaminc  ;

    public Apfle (String apfleName,double apfleGewicht ,double apfleVitamincgehalt) {
        this.name = apfleName;
        this.gewicht = apfleGewicht;
        this.vitaminc = apfleVitamincgehalt;
    }
    public String getName(){
        return name;
    }
    public double getGewicht(){
        return gewicht;
    }
    public double getVitaminc(){ return vitaminc; }
    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }

}

