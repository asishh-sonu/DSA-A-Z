public class ArrayPratice2{
    void SumofArray(){
        int arr[] = {1,2,3,5};
        int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        ArrayPratice2 obj = new ArrayPratice2();
        obj.SumofArray();
    }
}