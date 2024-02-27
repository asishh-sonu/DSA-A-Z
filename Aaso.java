import java.util.*;
public class Aaso{
    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int(numbers.length);

        prefix[0] = numbers[0];
        for(int i =0; i<prefix.length; i ++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]){
       int numbers[] = {2,4,6,8,10};
       maxSubArraySum(number); 
    }
}