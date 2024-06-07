import java.util.Scanner;

public class TripletSum {
    static int tripletSum(int[] arr, int target) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) { // for first number
            for (int j = i + 1; j < n; j++) { // for second number
                for (int k = j + 1; k < n; k++) { // for third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");

        int n = sc.nextInt();
        int[] arr = new int[n]; // Initialize the array
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum:");
        int target = sc.nextInt();
        System.out.println("Number of triplets with sum " + target + ": " + tripletSum(arr, target));
    }
}
