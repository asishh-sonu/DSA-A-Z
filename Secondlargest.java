import java.util.Scanner;
public class Secondlargest{
    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int[]arr){
        int mx = findMax(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;

            }
            
        }
        int SecondMax = findMax(arr);
            return SecondMax;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:  " );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Maximum element : " + findSecondMax(arr));
        }
}