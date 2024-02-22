import java.util.Scanner;

public class qesti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        int count = countElementsGreaterThanX(arr, x);
        System.out.println("Number of elements strictly greater than " + x + " is: " + count);

        scanner.close();
    }

    public static int countElementsGreaterThanX(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return count;
    }
}
