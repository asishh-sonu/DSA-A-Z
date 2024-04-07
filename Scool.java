class Scool {
   public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closestSum = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length - 2; i++) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum == target) {
                return sum;
            }
            if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                closestSum = sum;
            }
            if (sum < target) {
                lo++;
            } else {
                hi--;
            }
        }
    }

    return closestSum;
}

}