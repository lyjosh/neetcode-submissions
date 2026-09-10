class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int numZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                prod *= nums[i];
            } else {
                numZero++;
            }
        }
        if(numZero > 1){
            return new int[nums.length];
        }
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(numZero > 0){
                output[i] = (nums[i]== 0) ? prod : 0;
            } else {
                output[i] = prod / nums[i];
            }
        }
        return output;
    }
}  
