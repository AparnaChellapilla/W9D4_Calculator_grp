package com.tts;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    // variables - class global
    boolean flag = true;
    char op;
    int opOne;
    //    int minOption = 1;
    String message1 = "Enter the number of your selection";
    String message2 = "Please enter the first number";
    String message3 = "Please enter your number";
    //    String messageDollars = "Enter the number of whole USD";
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

            /*
             * Call to display the End User Initial Menu
             */
            displayMenu();

            /* collect menu option
             * inputs are string for display
             * return is an integer used to determine operation
             * @param string
             * @return integer
             */
            opOne = LoopArrays.getInputNumber(message1);

//            op = reader.next().charAt(0); // use local scanner and char for operation selection

            /*
             * switch statement to handle operation selection
             * input is an integer
             */
            switch(opOne) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    num2 = LoopArrays.getInputNumber(message2);     // done
                    num3 = LoopArrays.getInputNumber(message3);
                    ans = performOperation(opOne, num2, num3);
                    doubleTheNumOutput(opOne, num2, num3, ans);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    num3 = LoopArrays.getInputNumber(message3);     //done
                    ans = performOperation(opOne, num3, num2);
                    singleNumOutput(opOne, num3, ans);
                    break;
                case 10:
                    num3 = LoopArrays.getInputNumber(message3);     // done
                    System.out.println(factorialResult(num3));
                    break;
                case 11:
                case 12:
                case 13:
                    CurrencyCalc.currcalc(opOne);                   // done
                    break;
                case 14:
                    itemDiscount();                                  // done
                    break;
                case 15:
                    System.out.println("Thanks and good-bye");      // done
                    flag = false;
                    break;
                default:
                    System.out.println("default");
                    break;
            }

        }while(flag);


    }



    // display the end user menu
    private static void displayMenu(){
        System.out.println("---Please Select A Function By Entering The Number---");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Power or Square");
        System.out.println("6: Square Root ");
        System.out.println("7: Sin");
        System.out.println("8: Cosine");
        System.out.println("9: Tangent");
        System.out.println("10: Factorial");
        System.out.println("11: USD to €");
        System.out.println("12: € to USD");
        System.out.println("13: £ to USD");
        System.out.println("14: Discount");
        System.out.println("15: Quit Calculator");
    }

    private static void singleNumOutput(int opOne, double num1, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.println(num1 + " " + " = " + ans);
    }

    private static void doubleTheNumOutput(int opOne, double num1, double num2, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + " " + num2 + " = " + ans);
    }

    /**
     * Handles math operations excluding factorial
     * Inputs are char, and two doubles
     * return a double
     * @param operation number indicating the math operation to perform
     * @param num1  first operand of math operation
     * @param num2  second operand of math operation
     * @return      answer for each math operation
     */
    private double performOperation(int operation, double num1, double num2){
        /**
         *      Perform the operations based on input
         */
        double answer = 0;

        switch (operation) {
            case 1 -> answer = num1 + num2;
            case 2 -> answer = num1 - num2;
            case 3 -> answer = num1 * num2;
            case 4 -> answer = num1 / num2;
            case 5 -> answer = Math.pow(num1, num2);
            case 6 -> answer = Math.sqrt(num1);
            case 7 -> answer = Math.sin(Math.toRadians(num1));
            case 8 -> answer = Math.cos(Math.toRadians(num1));
            case 9 -> answer = Math.tan(Math.toRadians(num1));



        }
        return answer;
    }

    /**
     * performs factorial operations [Shout Out to Laura Wallace]
     * takes an int as input
     * returns BigInteger as output
     * @param fact1 int used to calculate the factorial; upper bound of the for loop
     * @return  the BigInteger of factorial
     */
    private BigInteger factorialResult (int fact1){
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= fact1; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return  result;
    }

    static void print(String line) {
        System.out.println(line);
    }

    private void itemDiscount() {
        int price;
        int discount;
        Scanner sc = new Scanner(System.in);
        print("Enter price of the product :");
        price = sc.nextInt();
        print("Enter Discount of the product :");
        discount = sc.nextInt();
        int finalPrice = (price * (100-discount)) / 100;
        print("Final price is " + finalPrice);
    }

}