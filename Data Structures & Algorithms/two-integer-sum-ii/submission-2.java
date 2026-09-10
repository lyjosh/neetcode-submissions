class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i = 0; i < numbers.length; i++){
        //     int diff = target = numbers[i];
        //     if(numbers.contains(diff) && diff != numbers[i]){
        //         int[] intended = new int[2];
        //         intended[0]=numbers[i];
        //         intended[1] = diff;
        //         return intended;
        //     }
        // }
        // return new int[2];

        int l = 0;
        int r = numbers.length - 1;
        while (l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }
            if(sum < target){
                l++;
            }
            if(sum > target){
                r--;
            }
        }
        return new int[0];
    }
}
