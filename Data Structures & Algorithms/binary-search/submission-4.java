class Solution {
    public int search(int[] nums, int target) {
        int index = search (nums, target,0, nums.length - 1 );
        return index;
    }

    public int search(int[] nums, int target, int lo, int hi){
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if(nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return search(nums, target, mid + 1, hi);
        } else {
            return search(nums, target, lo, mid - 1);
        }
    }
}

// public class Solution {
//     public int binary_search(int l, int r, int[] nums, int target) {
//         if (l > r) return -1;
//         int m = l + (r - l) / 2;
        
//         if (nums[m] == target) return m;
//         return (nums[m] < target) ? 
//             binary_search(m + 1, r, nums, target) : 
//             binary_search(l, m - 1, nums, target);
//     }

//     public int search(int[] nums, int target) {
//         return binary_search(0, nums.length - 1, nums, target);
//     }
// }