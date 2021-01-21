package com.tts;

import java.util.Scanner;


public class LoopArrays {

    public static Integer getInputNumber(String commPrompt) {
        int numResult = 0;
        boolean flag;
        String n;
        Scanner input = new Scanner(System.in);

        System.out.println(commPrompt);
        do {
            n = input.next();
            try {
                Integer.parseInt(n);
                numResult = Integer.parseInt(n);
                flag = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println(commPrompt);
                flag=true;
            }
        }while (flag);
        // printing out just to check assignment is successful
//        System.out.println(numResult);

        return numResult;
    }
}