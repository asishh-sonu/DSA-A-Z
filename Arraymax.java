public class Arraymax{
    void maxofArray(){
        int arr [] = {1,2,3,5,40,55};
        int ans = 0;

        for (int i = 0; i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("Max element is " + ans);
    }

    public static void main(String args[]){
        Arraymax obj = new Arraymax();
        obj.maxofArray();
    }
}