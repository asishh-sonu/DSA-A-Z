import java.util.*;
public class Star{
    public static void reverse(int numbers[]){
        int start = 0, end = numbers.length-1;

        while(start<end){

            //swap
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start ++;
            end --;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,5,6,10};
        reverse(numbers);

        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}