public class Solution {

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;  
        }

        int oneStepBefore = 1;
        int twoStepsBefore = 1; 
        int currentWays = 0;

        for (int i = 2; i <= n; i++) {
            currentWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentWays;
        }

        return currentWays;
    }

    public static void main(String[] args) {
        int n = 2;  
        int ways = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
