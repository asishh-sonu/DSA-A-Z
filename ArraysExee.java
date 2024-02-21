public class ArraysExee{
    void searchInArray(){
        int arr[] = {1,20,3,5,4,7};
        int x = 22;
        int ans = -1;

        for(int i = 0; i <arr.length; i++ ){
            if(arr[i] == x){
                ans = i;
            }
        }
        if(ans == -1){
            System.out.println("Not found");
        } else {
        System.out.println("Found " + x + " at index at " + ans);
        }
    }
    public static void main(String args[]){
        ArraysExee obj = new ArraysExee();
        obj.searchInArray();
    }
}