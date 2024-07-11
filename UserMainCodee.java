import java.io.*;
import java.util.*;

class UserMainCodee {

    public int findPIN(int input1, int input2, int input3, int input4) {
        int sumEven = 0;
        int sumOdd = 0;
        
        // Sum even and odd digits of input1
        sumEven += sumDigits(input1, true);
        sumOdd += sumDigits(input1, false);
        
        // Sum even and odd digits of input2
        sumEven += sumDigits(input2, true);
        sumOdd += sumDigits(input2, false);
        
        // Sum even and odd digits of input3
        sumEven += sumDigits(input3, true);
        sumOdd += sumDigits(input3, false);

        // Determine the PIN based on input4
        if (input4 % 2 == 0) {
            return sumEven - sumOdd;
        } else {
            return sumOdd - sumEven;
        }
    }

    private int sumDigits(int number, boolean isEven) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (isEven && digit % 2 == 0) {
                sum += digit;
            } else if (!isEven && digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input1 (four-digit number): ");
        int input1 = scanner.nextInt();

        System.out.println("Enter input2 (four-digit number): ");
        int input2 = scanner.nextInt();

        System.out.println("Enter input3 (four-digit number): ");
        int input3 = scanner.nextInt();

        System.out.println("Enter input4 (positive integer): ");
        int input4 = scanner.nextInt();

        UserMainCode code = new UserMainCode();
        int pin = code.findPIN(input1, input2, input3, input4);
        System.out.println("The calculated PIN is: " + pin);
    }
}