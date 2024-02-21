public class ArraysExe{
    void maxofArray(){
        int arr[] = {10,2,3,22,30,1,52};
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
            System.out.println("Max = " ans);
        }
    public static void main(String args[]){
        ArraysExe obj = new ArraysExe();
        obj.maxofArray();
    }
    }

}