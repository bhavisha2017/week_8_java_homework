/**
 * Even Digit Sum
 *Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
*/

public class Programme11_EvenDigitSum {

    //static method with return with parameter
    public static int getEvenDigitSum(int number){
        int total = 0;
        int qwert;
        if(number>0){
            while(number!=0){ //while loop
                qwert =  number % 10;
                if(qwert % 2 == 0){
                    System.out.println(qwert + " is a even digit");
                    total = total + qwert;
                }
                number = number / 10;
            }
            return total;
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
}