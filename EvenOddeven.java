public class EvenOddeven{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        String concat ="";
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
                concat+="even";
            }else {
                concat+="odd";
            }
           
        }
        System.out.println(concat);
    }
}