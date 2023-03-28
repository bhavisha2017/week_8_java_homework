import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */
public class Programme3_Alphabet {

    public static void main(String[] args) {

        //object creation for instance method
        Programme3_Alphabet obj =new Programme3_Alphabet();
        obj.vowel();
    }
        public void vowel(){
            int i = 0;
            // scanner declaration for reading input from console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any alphabet: ");
            char ch = scanner.next().charAt(0);

            //switch statement
            switch (ch) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    i++;
            }

            //if condition
            if (i == 1) {
                System.out.println("Enter Character " + ch + " is vowel");
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch <= 1))

                System.out.println("Enter Character " + ch + " is Consonant");

            else

                System.out.println("Error message");

            //closing the scanner object
            scanner.close();
        }
    }
