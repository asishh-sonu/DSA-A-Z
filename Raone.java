import java.util.*;
public class Raone{
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid=(start=end)/2;

            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                return mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,5,10,12,20,26,30,96};
        int key = 20;
        System.out.println("Index for key is : " + binarySearch(numbers,key));
    }
}