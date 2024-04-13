public class ReverseArray{
    public static void main(String args[]){
        int arr [] = {3,2,5,8};

        System.out.println("Array length = " + arr.length);
        System.out.println("Reverse oder of array is ");

        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}