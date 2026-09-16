class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int n : nums) {
            total+= n;
        }

        if (target > total || target < -total) {
            return 0;
        }


        int[][] dp = new int[nums.length+1][total*2+1];

        int offset = total;
        dp[0][offset] = 1;

        for (int i = 1; i <= nums.length; i++) {
            int num = nums[i-1];
            for (int sum = -total; sum <= total; sum++ ) {
                int index = sum + offset;
                if (dp[i-1][index] == 0) {
                    continue;
                }

                int plus = sum + num;
                dp[i][plus+offset] += dp[i-1][index];

                int minus = sum - num;
                dp[i][minus+offset] += dp[i-1][index];
            }
        }
    return dp[nums.length][target+offset];
    }

}
