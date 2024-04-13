public class SmallestArrayElement {
    public static void main(String args[]) {
        int arr[] = {2, 36, 5, 8, 52};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element is " + min);
    }
}
