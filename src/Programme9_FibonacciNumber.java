//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Programme9_FibonacciNumber {

    public void fibonacci() {// instance method

        int i = 1, n = 8, firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {// using while loop
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }

    public static void main(String[] args) {
        Programme9_FibonacciNumber obj = new Programme9_FibonacciNumber();
        obj.fibonacci();
    }

}
