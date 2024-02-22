import java.util.Scanner;

public  class ArrayG{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr [] = new int [n];

        System.out.println("Enetr array " + n + " elements ");

        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i] + "");
                                                
    }
}
}