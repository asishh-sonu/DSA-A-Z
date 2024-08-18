import java.util.*;
public class Catu{
    public static int[] sumofEvenandOdd(int[] arr){
        int sumEven = 0;
        int sumOdd = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                sumEven = sumEven+arr[i];
            } else{
                sumOdd = sumOdd + arr[i];
            }
        }
        return new int[]{sumEven,sumOdd};
    }
    public static void main(String args[]){
        int arr[] = {3,10,4,5,6};
        int result[] =  sumofEvenandOdd(arr);
        System.out.println("Sum of even numbers: " + result[0]);
        System.out.println("Sum of odd numbers: " + result[1]);
    }
}