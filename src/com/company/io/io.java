package com.company.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class IO {

        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        public static boolean readBoolean() throws IOException {
            while (true) {
                String eingabe = br.readLine().trim();
                if ((eingabe.equals("1"))
                        || (eingabe.equalsIgnoreCase("j"))
                        || (eingabe.equalsIgnoreCase("ja"))
                        || (eingabe.equalsIgnoreCase("y"))
                        || (eingabe.equalsIgnoreCase("yes"))
                        || (eingabe.equalsIgnoreCase("w"))
                        || (eingabe.equalsIgnoreCase("wahr"))
                        || (eingabe.equalsIgnoreCase("t"))
                        || (eingabe.equalsIgnoreCase("true"))) {
                    return true;
                }
                else if ((eingabe.equals("0"))
                        || (eingabe.equalsIgnoreCase("n"))
                        || (eingabe.equalsIgnoreCase("nein"))
                        || (eingabe.equalsIgnoreCase("no"))
                        || (eingabe.equalsIgnoreCase("f"))
                        || (eingabe.equalsIgnoreCase("falsch"))
                        || (eingabe.equalsIgnoreCase("false"))) {
                    return false;
                }
                System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
            }
        }



        public static String readString() throws IOException {
            return br.readLine();
        }



        public static double readDouble() throws IOException {
            while (true) {
                String text = br.readLine().trim().replace(',', '.');
                try {
                    double zahl = Double.parseDouble(text);
                    return zahl;
                }
                catch (NumberFormatException e) {
                    System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
                }
            }
        }


        public static int readInteger() throws IOException {
            while (true) {
                String text = br.readLine().trim().replace(',', '.');
                try {
                    int zahl = Integer.parseInt(text);
                    return zahl;
                }
                catch (NumberFormatException e) {
                    System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
                }
            }
        }
    }

