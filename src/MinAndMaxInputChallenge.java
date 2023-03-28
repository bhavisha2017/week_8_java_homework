import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */

public class MinAndMaxInputChallenge {

    public void minAndMax() {
        int i = 1;

        while (i <= 5)
        {
            int min = 0;
            int max = 0;

            System.out.println("Enter number: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();


            if (number < min)
            {
                min = number;
            }
            System.out.println("minimum number : " + min);

            if (number > max)
            {
                max = number;
            }
            System.out.println("maximum number: " + max);
            i++;


        }
    }


    public static void main(String[] args) {

        //object creation for instance method
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.minAndMax();
    }

}




