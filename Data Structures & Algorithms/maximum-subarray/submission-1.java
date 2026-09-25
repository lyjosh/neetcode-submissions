class Solution {
    public int maxSubArray(int[] nums) {
        return maxSolve(nums, 0, nums.length - 1);
    }

    private int maxSolve(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        int leftMax = maxSolve(nums, left, mid);
        int rightMax = maxSolve(nums, mid+1, right);
        int crossMax = maxCrossing(nums, left, right, mid);
        return Math.max(leftMax, Math.max(rightMax, crossMax));
    }

    private int maxCrossing(int[] nums, int left, int right, int middle) {
        int maxLeft = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = middle; i >= left; i--) {
            sum += nums[i];
            maxLeft = Math.max(maxLeft, sum);
        }

        sum = 0;
        int maxRight = Integer.MIN_VALUE;
        for (int i = middle + 1; i <= right; i++ ) {
            sum += nums[i];
            maxRight = Math.max(maxRight, sum);
        }
        return maxLeft + maxRight;
    }
}
