// Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class Programme15_LeftAngleTriangle {

    public static void main(String[] args)
    {
        //Scanner declaration for reading input form consol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int size = scanner.nextInt();

        Programme15_LeftAngleTriangle program15LeftTriangle = new Programme15_LeftAngleTriangle();
        program15LeftTriangle.leftTriangle(size);

        //closing the scanner object
        scanner.close();

    }

    public void leftTriangle(int size) {


        //nested for loop
        for(int i =1; i<=size; i++)
        {
            for (int j = 1; j <= size -  i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
    }



