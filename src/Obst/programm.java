package Obst;

public class programm {
    public static void main(String[] args) {

        Banane banane1 = new Banane(120.5,"meine krumme banane 1",32);
        Banane banane2 = new Banane(102.3,"meine krumme banane 2",45);
        Banane weintraube1 =new Banane(88.5,"weintrauben",77);
        System.out.println( "name =:" + banane1.getName());
        System.out.println( "gewicht =:" + banane1.getGewicht());
        System.out.println( "´vitamin c gehalt =:" + banane1.getVitaminc());
        System.out.println( "name =:" + banane2.getName());
        System.out.println( "gewicht = :" + banane2.getGewicht());
        System.out.println( "vitamin c gehalt =:" + banane1.getVitaminc());


    }

}
