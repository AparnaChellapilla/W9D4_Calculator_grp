package com.tts;
import java.lang.Math.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    // variables - class global
    boolean flag = true;
    char op;
    double num1 = 0;
    double num2 = 0;
    int num3 = 1;
    double ans;
    BigInteger bigAnswer;

    public void main(int args) {

        // setup scanner to get the input from the console
        Scanner reader = new Scanner(System.in);

        // like a game loop - keep running until Q is selected
        do{

            System.out.print("\nEnter an operator (+, -, *, /, ^, F, R, S, C, T, Q): ");
            op = reader.next().charAt(0);


            // Choose a single or double operand
            switch (op){
                case 'F':
                    System.out.print("Enter one number: ");
                    num3 = reader.nextInt();
                    System.out.println(factorialResult(num3));
                    break;
                case 'R':
                case 'S':
                case 'C':
                case 'T':
                    System.out.print("Enter one number: ");
                    num1 = reader.nextDouble();
                    ans = performOperation(op, num1, num2);
                    singleNumOutput(op, num1, ans);
                    break;
                case 'Q':
                    System.out.println("Thanks and good-bye");
                    flag = false;
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    System.out.print("Enter two numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();
                    ans = performOperation(op, num1, num2);
                    doubleTheNumOutput(op, num1, num2, ans);
                    break;
                default:
                    System.out.println("Let's try that again. ");
                    break;
            }
        }while(flag);


    }

    private static void singleNumOutput(char op, double num1, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " = " + ans);
    }

    private static void doubleTheNumOutput(char op, double num1, double num2, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }

    /**
     * Handles math operations excluding factorial
     * Inputs are char, and two doubles
     * return a double
     * @param op
     * @param num1
     * @param num2
     * @return
     */
    private double performOperation(char op, double num1, double num2){
        double answer = 0;
/**
 *      Perform the operations based on input
 **/
        switch (op) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
            case '^' -> answer = Math.pow(num1, num2);
            case 'R' -> answer = Math.sqrt(num1);
            case 'S' -> answer = Math.sin(num1);
            case 'C' -> answer = Math.cos(num1);
            case 'T' -> answer = Math.tan(num1);
        }
        return answer;
    }

    /**
     * performs factorial operations [Shout Out to Laura Wallace]
     * takes an int as input
     * returns BigInteger as output
     * @param fact1
     * @return
     */
    private BigInteger factorialResult (int fact1){
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= fact1; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return  result;
    }


}