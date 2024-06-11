public class MultiDimArray{
    static void printArray(int [] [ ] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int arr2 [] [] = {{1,2,3},{4,5,6,5},{5,6,5,5,6}};
        printArray(arr2);
    }
}