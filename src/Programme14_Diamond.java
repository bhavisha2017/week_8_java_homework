import java.util.Scanner;

/** 14. Write a program in Java to display the pattern like a diamond.
 *While loop
*/


public class Programme14_Diamond {



    public static void main(String[] args)
    {
        //Instance object
        Programme14_Diamond programme14Diamond = new Programme14_Diamond();
        programme14Diamond.diamond();
    }

    public void diamond()
    {
        //Scanner declaration for reading input form consol
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int size = scanner.nextInt();

        //while loop
        int i=1;
        int j;
        while(i<=size)
        {
            j=1;
            while(j++<=size-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i=size-1;
        while(i>0)
        {
            j=1;
            while(j++<=size-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
        scanner.close();
    }
}


