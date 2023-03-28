/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */
public class Programme13_SharedDigit {

   // static method
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        //if condition
        if(( firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)){
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            firstNumber /= 10;
            secondNumber /= 10;
            int firstNumberfirsttDigit = firstNumber;
            int secondNumberfirstDigit = secondNumber;
            System.out.println("Is there any shared digit in both number? ");
            return ((firstNumberfirsttDigit == secondNumberfirstDigit) || (firstNumberfirsttDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberfirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
        }
        System.out.println("Invalid input");
        return false;
    }

    public static void main(String[] args) {// static method
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
