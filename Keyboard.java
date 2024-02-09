import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keyboard {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> dp = new ArrayList<>();

        for(int i = 0; i < n; i++){
            dp.add(new ArrayList(List.of(nums[i])));
        }
        int maxL = 1;
        int maxLIndex = 0;
        for(int i = 1; i < n; i++){
            for(int j = i - 1; j >=0 ; j--){
                if((nums[i] % dp.get(j).get(dp.get(j).size() - 1)) == 0){
                    if(dp.get(j).size() + 1 > dp.get(i).size()){
                        dp.set(i, new ArrayList<>(dp.get(j)));
                        dp.get(i).add(nums[i]);
                    }

                    if(maxL < dp.get(i).size()){
                        maxL = dp.get(i).size();
                        maxLIndex = i;
                    }
                }
            }
        }

        return dp.get(maxLIndex);

    }
}