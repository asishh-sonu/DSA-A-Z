public class DuplicateElementsinArray{
    public static void main(String args[]){
        int arr [ ] = {3,5,2,3,5,6};

        System.out.println("Duplicate elements in the array are :");

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}