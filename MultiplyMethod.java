import java.util.Scanner;

public class MultiplyMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (Press * to stop): ");
        double[] numbers = readNumbers(scanner);

        if (numbers.length == 2) {
            double result = multiply(numbers[0], numbers[1]);
            System.out.println("Method for Two numbers called - Result: " + result);
        } else if (numbers.length == 3) {
            double result = multiply(numbers[0], numbers[1], numbers[2]);
            System.out.println("Method for Three numbers called - Result: " + result);
        } else {
            double result = multiply(numbers);
            System.out.println("Method for multiple numbers called - Result: " + result);
        }
    }

    public static double[] readNumbers(Scanner scanner) {
        double[] numbers = new double[100];
        int index = 0;

        while (true) {
            String input = scanner.next();
            if (input.equals("*")) {
                break;
            }
            numbers[index++] = Double.parseDouble(input);
        }

        double[] actualNumbers = new double[index];
        System.arraycopy(numbers, 0, actualNumbers, 0, index);
        return actualNumbers;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static double multiply(double... numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }
}
