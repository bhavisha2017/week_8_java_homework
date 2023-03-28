import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */

public class Programme6_Triangle {

    public static void main(String[] args){

        //Scanner declaration for reading input form consol
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of raw  : ");
        int n1 = scanner.nextInt();

        //static object
        triangleNumber(n1);

        //closing the scanner object
        scanner.close();
    }

    //static method
    public static void triangleNumber(int size)
    {
        //nested for loop
        for(int i =1; i<=size; i++)
        {
            for(int j = 1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }


    }

}
