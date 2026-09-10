class Solution {
    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        return stairs(n, 0);
    }

    public int stairs(int n, int curr){
        if(n == curr){
            return 1;
        }
        if(curr > n){
            return 0;
        }
        return stairs(n, curr + 1) + stairs(n, curr + 2);
        
    }
}
