public class SearchinginArray{
    void LinersearchArray(){
        int arr [ ] = {23,25,23,63,41,52,27};

        int x = 27;
        int ans = -1;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]== x){
                ans = i;
            }
        }
        System.out.println("Found " + x + " at the index " + ans);
     }

     public static void main(String args[]){
        SearchinginArray obj = new SearchinginArray();
        obj.LinersearchArray();
     }
}