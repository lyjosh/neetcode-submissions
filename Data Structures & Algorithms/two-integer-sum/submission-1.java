class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> prev = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            prev.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(prev.containsKey(diff) && prev.get(diff) != i){
                return new int[] {i, prev.get(diff)};
            }
            
        }
        return new int[0];
    }
}
