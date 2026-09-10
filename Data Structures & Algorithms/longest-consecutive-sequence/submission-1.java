class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        int streak = 1;


        if (nums.length == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            }
            
            if (nums[i] == nums[i-1] + 1) {
                streak++;
            } else {
                streak=1;
            }
            res = Math.max(streak, res);


            
        }

        return res;



    }
}
