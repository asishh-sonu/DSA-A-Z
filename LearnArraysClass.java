import java.util.Arrays;
public class LearnArraysClass{
    public static void main(String args[]){
        int [] numbers = {1,23,25,52,56,36,85,41,2};
        
        // Sort the array before performing binary search
        Arrays.sort(numbers);
        for(int i :  numbers){
            System.out.print(i + " ");
        }
        System.out.println();
        
         // Perform binary search for the element 2
        int index = Arrays.binarySearch(numbers,85);

        System.out.println("The index of element 2 in the array is : " + index);
    }
}