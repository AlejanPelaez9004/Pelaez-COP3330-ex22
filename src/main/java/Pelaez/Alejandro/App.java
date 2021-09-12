/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int one = input.nextInt();
        System.out.print("Enter the second number: ");
        int two = input.nextInt();
        System.out.print("Enter the third number: ");
        int three = input.nextInt();
        int largestNum = 0;

        if (one != two && two != three && three != one)
        {
            if (one > two && one > three)
                largestNum = one;
            if (two > one && two > three)
                largestNum = two;
            if (three > one && three > two)
                largestNum = three;
        }
        else
        {
            System.out.println("Numbers are the same");
            return;
        }


        System.out.println("The largest number is " + largestNum);
    }
}
