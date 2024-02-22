import java.util.*;
public class ques{
    static int lastOccurrences(int arr[], int x){
        int lastIndex = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){ 
                lastIndex = i;

            }
        }
        return lastIndex;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr [] = new int [n];
        System.out.println("Enter array " + n + " Elements : ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Last occurrence : " + lastOccurrences(arr, x));
    }
}