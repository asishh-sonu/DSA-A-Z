import java.util.*;

class Race{
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0;i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest Number is :" +  smallest);
        return largest;
    }



    public static void main(String args[]){
        int numbers [] = {1,2,5,6,9,9,66,63,4,10};
        System.out.println("Largest value is :" + getLargest(numbers));
    }
}