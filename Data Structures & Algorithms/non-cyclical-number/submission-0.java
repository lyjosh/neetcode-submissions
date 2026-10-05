class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    private int sumOfSquares(int n) {
        int res = 0;

        while (n > 0) {
            int dig = n%10;

            dig = dig * dig;

            res += dig;
            n /= 10;
        }
        return res;
    }
}
