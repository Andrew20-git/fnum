package com.company;

public class forToWhileübung {
    public static void main(String[] args) {

        int i = 1;
        while (i <=5){
            System.out.println("Numero " + i);
            i = i +1;
        }

        int j = 2;
        while (j<=10) {
            System.out.println("Team "+j);
            j = j+=2;
        }

        int l = 10 ;
        while(l>=0) {
            if (l>0){
                System.out.println(l);
            }else{

                System.out.println("Lift off!");
            }
            l =l -1;
        }

        int x= 1;
        while(x<= 5){
            int summe = 0;

            int y = 1;
            while(y<=x){
                summe += y;
                y = y +1;

            }
            System.out.println("Summe 1 bis "+x+": "+summe);
            x = x + 1;
        }
    }

}
