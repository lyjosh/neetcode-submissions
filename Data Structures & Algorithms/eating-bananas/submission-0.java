class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int max = piles[piles.length - 1];

        int left = 1;
        int right = max;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }


        }

        return left;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int time = 0;
        for (int i = 0; i < piles.length; i++ ) {
            time += (piles[i]+k-1) / k;
                if (time > h) {
                    return false;
                }
        }
        return true;

     }
}
