/**
 * 18. Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */

public class SimpleCalculator {
      //instance variables
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){// method 1
        return firstNumber;
    }
    public double getSecondNumber(){// method 2
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){// method 3
        this.firstNumber = firstNumber;

    }
    public void setSecondNumber(double secondNumber){// method 4
        this.secondNumber = secondNumber;

    }
    public double getAdditionResult(){// method 5
        return(firstNumber + secondNumber);

    }
    public double getSubtractionResult(){// method 6
        return(firstNumber - secondNumber);

    }
    public double getMultiplicationResult(){// method 7
       return(firstNumber * secondNumber);

    }
    public double getDivisionResult(){ //method 8
         if(secondNumber == 0){
             return 0;
         }else{
             return (firstNumber / secondNumber);
         }
    }

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }
}
