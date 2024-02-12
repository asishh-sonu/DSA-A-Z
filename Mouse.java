public class Mouse {

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majority = majorityElement(nums);
        System.out.println("Majority element: " + majority);
    }
}
         