import java.util.*;
public class Tiger{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //- Infinity

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,12,25,6,8,50};
        System.out.println("Largest number is " + getLargest(numbers));
    }
}