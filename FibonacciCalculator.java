import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(findNthFibonacci(n));
    }

    public static int findNthFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
