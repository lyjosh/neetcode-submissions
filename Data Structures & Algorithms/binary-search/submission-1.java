// class Solution {
//     public int search(int[] nums, int target) {
//         int found = search(nums, target, 0, nums.length - 1);
//         return found;
//     }

//     private int search(int[] nums, int target, int lo, int hi){
//         if(lo > hi){
//             return -1;
//         }
//         int mid = 1+(hi - lo)/2;
//         if(target == nums[mid]){
//             return mid;
//         } else if(target < nums[mid]){
//             return search(nums, target, lo, mid-1);
//         } else{
//             return search(nums, target, mid + 1, hi);
//         }
//     }
// }

public class Solution {
    public int binary_search(int l, int r, int[] nums, int target) {
        if (l > r) return -1;
        int m = l + (r - l) / 2;
        
        if (nums[m] == target) return m;
        return (nums[m] < target) ? 
            binary_search(m + 1, r, nums, target) : 
            binary_search(l, m - 1, nums, target);
    }

    public int search(int[] nums, int target) {
        return binary_search(0, nums.length - 1, nums, target);
    }
}