package com.tts;
import java.util.Scanner;


    public class CurrencyCalc {
        public static void currcalc(int exchange) {

            Scanner reader = new Scanner(System.in);

        /*
        accepts integer for decision and executes
        displays output
        does not return
         */
            switch (exchange) {
                case 11: {
                    System.out.println("Enter the number of USD");
                    double usd = reader.nextDouble();

                    if (usd >= 0) {
                        System.out.println(" USD is " + usd * 0.908 + " €. ");
                        System.out.println();
                    } else {
                        System.out.println("Please put in positive numbers of USD");
                    }
                }
                break;
                case 12: {
                    System.out.println("Enter the number of €");
                    double euro = reader.nextDouble();

                    if (euro >= 0) {
                        System.out.println(euro + " € is " + euro * 1.101 + " USD. ");
                    } else {
                        System.out.println("Please put in positive numbers of €.");
                    }
                }
                break;
                case 13: {
                    System.out.println("Enter the number of £");
                    double pounds = reader.nextDouble();

                    if (pounds >= 0) {
                        System.out.println(pounds + " £ is " + pounds * 1.28 + " USD ");
                    } else {
                        System.out.println("Please put in positive number of £ ");
                    }
                }
                break;
            }

        }

    }

