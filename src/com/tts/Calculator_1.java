package com.tts;

import java.util.Scanner;

public class Calculator_1 {

          public static void main(int args) {
            double num1 = 0;
            double num2 = 0;
            double ans = 1;
            double fact = 1;
            int op;

            Scanner reader = new Scanner(System.in);

            //System.out.print("\nEnter an operator (+, -, *, /, ^, R, S, C, T , F): ");
            System.out.println("Enter 1.Sum of two integers ");
            System.out.println("Enter 2.Subtract two integers ");
            System.out.println("Enter 3.Product of two integers ");
            System.out.println("Enter 4.Division of two integers ");
            System.out.println("Enter 5..Remainder of two integers ");
            System.out.println("Enter 6.Size and Power of two integers ");
            System.out.println("Enter 7.Get SquareRoot of an integer ");
            System.out.println("Enter 8.Get Sine of a number in radians ");
            System.out.println("Enter 9.Get Cosine of a number in radians ");
            System.out.println("Enter 10.Get Tangent of a number in radians ");
            System.out.println("Enter 11.Get Factorial of a number  ");

            op = reader.nextInt();
        /*if(op == 'R' || op == 'S' || op == 'C' || op == 'T'){
            System.out.print("Enter one number: ");
            num1 = reader.nextDouble();
            *//*System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();*//*
        } else {
            System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
        }*/
            // Choose a single or double operand
            switch (op){
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    System.out.print("Enter one number: ");
                    num1 = reader.nextDouble();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    System.out.print("Enter two numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();
            }
            // Perform the operators
            switch(op) {
                case 1: ans = num1 + num2;
                    break;
                case 2: ans = num1 - num2;
                    break;
                case 3: ans = num1 * num2;
                    break;
                case 4: ans = num1 / num2;
                    break;
                case 6: ans = Math.pow(num1,num2);
                    break;
                case 7: ans = Math.sqrt(num1);
                    break;
                case 8: ans = Math.sin(num1);
                    break;
                case 9 : ans= Math.cos(num1);
                    break;
                case 10: ans = Math.tan(num1);
                    break;
                case 11 :
                    for(int i=1;i<=num1;i++)
                    {
                        fact= fact * i;
                    }
                    System.out.println("Factorial of "+num1+" is: "+fact);
                    break;
// need the factorial code
//            System.out.println("Factorial of "+number+" is: "+fact);
                default: System.out.print("Error! Enter correct operator");
                    return;
            }


            // Handle the output
            switch(op) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    doubleTheNumOutput(op, num1, num2, ans);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    singleNumOutput(op, num1, ans);
                    break;
                default: System.out.print("Unspecified Error! Please restart program!");
            }

        }

        private static void singleNumOutput(int op, double num1, double ans) {
            System.out.print("\nThe result is given as follows:\n");
            System.out.print(num1 + " " + op + " = " + ans);
        }

        private static void doubleTheNumOutput(int op, double num1, double num2, double ans) {
            System.out.print("\nThe result is given as follows:\n");
            System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
        }
    }

