public class CopingArray{
    public static void main(String args[]){
        int arr1 [ ] = {1,3,5};

        int arr2 [ ] = new int [arr1.length];

        for(int i =0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.print("Display the array elements : ");
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i] +  " ");
        }

    }
}