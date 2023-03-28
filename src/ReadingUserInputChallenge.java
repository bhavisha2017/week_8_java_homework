import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */

public class ReadingUserInputChallenge {


    public static void main(String[] args) {

        int x= 1;
        int number = 10;
        int sum = 0;

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 number");


        while (x <= 10) {
            System.out.println("Enter number# " + x +  ":" );
            boolean num = scanner.hasNextInt();


            if(num) {

             number = scanner.nextInt();
             x++;
             sum += number;
         }else{
                System.out.println("Invalid number");

            }
        }
        //scanner object closed
        scanner.close();

        //sum of user input
        System.out.println("sum of given number is: " +sum);
    }

    }




