import java.util.Scanner;
public class Lion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            if(i == arr.length-1){
                System.out.print(arr[i]);
            } else{
                System.out.print(" " + arr[i]);
            }
        }
    }
}