/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Davis
 */

import java.util.Scanner;

public class Solution05 {
    /* Begin pseudocode */
    // Create Addition method: accepts two ints, adds them together, returns an int.
    // Create Subtraction method: accepts two ints, subtracts second from first, returns an int.
    // Create Multiplication method: accepts two ints, multiplies them, returns an int.
    // Create Division method: accepts two ints, divides first by second, returns an int (cannot deal with remainders).
    // Create Scanner object.
    // Scan input for num1.
    // Reject input if input not int.
    // Reject input if input is negative.
    // Call each method to perform calculations and print results.
    /* End pseudocode */

    public static int addition(int num1, int num2){
        int answer = num1 + num2;
        return answer;
    }

    public static int subtraction(int num1, int num2){
        int answer = num1 - num2;
        return answer;
    }

    public static int multiplication(int num1, int num2){
        int answer = num1 * num2;
        return answer;
    }

    public static int division(int num1, int num2){
        int answer = num1 / num2;
        return answer;
    }

    public static boolean isInt(String in){
        if(in == null){
            return false;
        }
        try{
            int i = Integer.parseInt(in);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String input = userInput.nextLine();
        int number_1 = 0;
        if(isInt(input)==true){
            number_1 = Integer.parseInt(input);
        }
        while(number_1<0 || isInt(input) == false){
            System.out.print("Invalid input.  Please enter a positive integer for the first number. ");
            input = userInput.nextLine();
            if(isInt(input)==true){
                number_1 = Integer.parseInt(input);
            }
        }
        System.out.print("What is the second number? ");
        input = userInput.nextLine();
        int number_2 = 0;
        if(isInt(input) == true){
            number_2 = Integer.parseInt(input);
        }
        while(number_2<0 || isInt(input) == false){
            System.out.print("Invalid input. Please enter a positive integer for the second number. ");
            input = userInput.nextLine();
            if(isInt(input)==true){
                number_2 = Integer.parseInt(input);
            }
        }
        System.out.println(number_1 + " + " + number_2 + " = " + addition(number_1, number_2) + "\n" + number_1 + " - " + number_2 + " = " + subtraction(number_1, number_2)+ "\n" + number_1 + " * " + number_2 + " = " + multiplication(number_1, number_2) + "\n" + number_1 + " / " + number_2 + " = " + division(number_1, number_2));


    }


}
