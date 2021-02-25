package com.company.io;

import java.io.IOException;

public class PieBerechnen {
    public static void main(String[] args) throws IOException {
        System.out.println("geben sie die gewüntschten durschleufe ein (n)");

         int durschleufe = IO.readInteger() ;
         double wert=0;

         for (int k = 0 ; k <= durschleufe ; k++ ){

         wert = wert + (Math.pow(-1,k) / ((2*k) +1)) ;

         }
         double pie = (wert * 4);
        System.out.println("ihr wert =" +pie);
    }



}
