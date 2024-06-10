import java.util.*;
public class InsertionSort{
    public static void insertionsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            //finding out the correct pos to insert

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
                //insert
                arr[prev+1]=curr;
            }
        }
    }
}

public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void main(String args[]){
    int arr = {5,4,3,2,1};
    insertionsort(arr);
    printArr(arr);
}
