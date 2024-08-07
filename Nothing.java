import java.util.*;
class Nothing{
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        //comparision
        while(start<=end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start  = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,5,6,7,8,9,10,14,15,12,13};
        int key = 10;
        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}