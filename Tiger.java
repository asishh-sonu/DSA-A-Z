import java.util.*;
public class Tiger{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //- Infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {10,12,25,6,8,50};
        System.out.println("Largest number is " + getLargest(numbers));
    }
}