public class OddEvenNumbersinArray{
    public static void main(String args[]){
        int arr [ ] = {2,3,5};

        System.out.print("Odd numbers are :");

        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("Even numbers are :");
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
        } 
    }
}