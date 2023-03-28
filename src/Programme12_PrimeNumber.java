// Write a programme to input any number and check if it is prime or not.

import java.util.Scanner;

public class Programme12_PrimeNumber {

    public static void main(String[] args) {


            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int number = scanner.nextInt();

            //instance object
            Programme12_PrimeNumber programme12PrimeNumber = new Programme12_PrimeNumber();
            programme12PrimeNumber.prime(number);

            //closing the scanner object
            scanner.close();
        }

        //instance method no return with parameter
        public void prime( int n){
            int count = 0;
            //for loop
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            //if statement
            if (count == 0 && n != 1) {
                System.out.println(n + " is a Prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }
    }
