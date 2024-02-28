public class Kadans{
    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum= maxSubArraySum(arr);
        System.out.println("Maximum sunarray summ is = " + maxSum);
    }
    public static int maxSubArraySum(int arr[]){
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEndingHere = Math.max(arr[i],maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        } 
        return maxSoFar;
    }
}