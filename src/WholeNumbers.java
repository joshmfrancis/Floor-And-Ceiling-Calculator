// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_3_4
// File Name: WholeNumbers.java

//Write a program that reads a floating point number from the user.
//Print out the closest whole numbers and a rounded value. In other words, you need to print the floor, the ceiling and the rounded value of a number.
//If the number the user gives you is, for example 28.466, then it should print
//Floor: 28
//Ceiling: 29
//Rounded: 28

import java.util.Scanner;

public class WholeNumbers {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      double value; // the value the user will enter
      long valRound, valFloor, valCeil;
      
      // Read the double value from the user
      System.out.println("Enter a floating point number: ");
      value = scan.nextDouble();
      
// Approach 1 to achieve the outcome
//      System.out.println("The ceiling of the value is: " + (long)Math.ceil(value));
//      System.out.println("The floor of the value is: " + (long)Math.floor(value));
//      System.out.println("The rounded value is: " + Math.round(value));

// Approach 2 to achieve the outcome
        valRound = Math.round(value);
        valFloor = (long)Math.floor(value);
        valCeil = (long)Math.ceil(value);
        
        System.out.println("The ceiling of the value is: " + valCeil);
        System.out.println("The floor of the value is: " + valFloor);
        System.out.println("The rounded value is: " + valRound);
        
    }
    
}
