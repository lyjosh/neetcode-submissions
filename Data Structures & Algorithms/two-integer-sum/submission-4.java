class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pos = new HashMap<>();
        for(int i = 0;i < nums.length; i++) {
            pos.put(nums[i], i);
        }
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (pos.containsKey(diff) && pos.get(diff)!= i) {
                return new int[] {i, pos.get(diff)};
            }
        }
        return new int[0];
    }
}
