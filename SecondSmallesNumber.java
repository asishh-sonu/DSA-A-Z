public class SecondSmallesNumber{
    public static void main(String args[]){
        int arr [] = {3,5,6,8,32,25,45};
        int temp,size;
        size=arr.length;

        System.out.print("Array size is " + size);

        for(int i = 0; i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("Elemets of array in descending oder ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Second largerst number is " + arr[size - 2]);
    }

}