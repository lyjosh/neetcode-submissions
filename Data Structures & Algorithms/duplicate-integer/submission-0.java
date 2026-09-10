class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> unique = new HashSet<>();
       for(int i = 0; i < nums.length; i++) {
            int currSize = unique.size();
            unique.add(nums[i]);
            if(currSize == unique.size()){
                return true;
            }
       }
       return false;
    }
}
