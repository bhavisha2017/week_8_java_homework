import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme10_ArmstrongNumber {

    public static void main(String args[]) {
        int number = 153;
        int check, rem, sum = 0;
        System.out.println("Enter the number to be verified:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        check = number;
        while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if(sum == number)
            System.out.println("Given number is an armstrong number.");
        else
            System.out.println("Given number is not an armstrong number.");
    }

}
