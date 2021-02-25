package com.company;

public class schleifenÜbungen {
    public static void main(String[] args) {
        //**for (int i = 3; i <= 10 ; i++){
        //   System.out.println(i);
        //}
        //for (int i = 2; i <=12 ; i=i+2 ){
        //    System.out.println(i);
        //}
        //for (int i = 20 ; i >=10; i=i-2){
        //  System.out.println(i);
        //}
        //int summe = 0 ;
        //for (int i = 0 ; i <= 10 ; i ++){
//
        //       summe = summe + i ;
        //        System.out.println(summe);
        //  }

        int x =1;
        int y =1;

        while (y < 3) {


            System.out.print(x*y);
            y = y +1;

            while(x <5){

                y = y +1;

                System.out.print(x*y);
                x =x +1;
            }
        }




    }
}
