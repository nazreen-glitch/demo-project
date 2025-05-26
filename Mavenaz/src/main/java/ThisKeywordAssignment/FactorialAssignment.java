package ThisKeywordAssignment;

public class FactorialAssignment {

    static int calculate(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


    static void printResult(int n) {
        int result = calculate(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }


    public static void main(String[] args) {
        printResult(5);
    }
}

