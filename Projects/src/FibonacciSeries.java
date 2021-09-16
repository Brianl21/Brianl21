import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number in the series");
        int maxNumber = sc.nextInt();
        System.out.println("fib series of " + maxNumber + " numbers:");
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(firstNumber + " ");
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }

    }
}


