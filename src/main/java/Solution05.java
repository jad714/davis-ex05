/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Davis
 */

import java.util.Scanner;

public class Solution05 {
    /* Begin pseudocode */
    // Create Scanner object.
    // Scan input for num1.
    // Store num1 string as integer.
    // Scan input for num2.
    // Store num2 string as integer.
    // Perform addition on num1 and num2.
    // Perform subtraction on num1 and num2.
    // Perform multiplication on num1 and num2.
    // Perform division on num1 and num2.
    /* End pseudocode */

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String input = userInput.nextLine();
        int number_1 = Integer.parseInt(input);
        System.out.print("What is the second number? ");
        input = userInput.nextLine();
        int number_2 = Integer.parseInt(input);
        int result_addition = number_1 + number_2;
        int result_subtraction = number_1 - number_2;
        int result_multiplication = number_1 * number_2;
        int result_division = number_1 / number_2;
        System.out.println(number_1 + " + " + number_2 + " = " + result_addition + "\n" + number_1 + " - " + number_2 + " = " + result_subtraction + "\n" + number_1 + " * " + number_2 + " = " + result_multiplication + "\n" + number_1 + " / " + number_2 + " = " + result_division);
    }


}
