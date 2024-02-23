import java.util.Scanner;

public class quz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = isSorted(arr);
        if(isSorted){
            System.out.println("The array is sorted in ascending order.");

        }else {
            System.out.println("The array is not sorted in ascending order.");
        }
        
        }
        public static boolean isSorted(int arr[]){
            for (int i = 0; i<arr.length - 1; i++){
                if (arr[i]> arr[i]){
                    return false;
                }
            }
            return true;
        }
}