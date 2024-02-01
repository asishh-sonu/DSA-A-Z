import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

   public static int[][] divideArray(int[] nums, int k) {
       Arrays.sort(nums);
       List<int[]> result = new ArrayList<>();
       for (int i = 0; i < nums.length; i++) {
           if (i + 2 < nums.length && nums[i + 2] - nums[i] <= k) {
               result.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
               i += 2;
           } else {
               return new int[][]{}; 
           }
       }
       return result.toArray(new int[result.size()][]);
   }

   public static void main(String[] args) {
       int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
       int k = 2;
       int[][] result = divideArray(nums, k);
       System.out.println(Arrays.deepToString(result));
   }
}
