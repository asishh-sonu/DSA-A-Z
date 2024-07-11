import java.io.*;
import java.util.*;

class UserMainCode {

    public int sumOfPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;

        for (int i = 2; i < input2; i++) { // start from 2 as 0 and 1 are not prime
            if (isPrime(i)) {
                sum += input1[i];
            }
        }

        return sum;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        UserMainCode code = new UserMainCode();
        int result = code.sumOfPrimeIndexValues(array, n);
        System.out.println("The sum of values at prime indexes is: " + result);
    }
}



