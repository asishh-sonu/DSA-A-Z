import java.util.Scanner;

public class LargestSmallest{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int numbers [] = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int  i = 0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i<numbers.length; i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
            if(numbers[i]> largest){
                largest = numbers[i];
            }
        }
        System.out.println("Smallest number : " + smallest);
        System.out.println("Largest number : " + largest);


        
    }
}