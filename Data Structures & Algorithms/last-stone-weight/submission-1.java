class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> weights = new PriorityQueue<>();
        for( int curr : stones){
            weights.add(-curr);
        }

        while(weights.size() > 1){
            int first = weights.remove();
            int second = weights.remove();
            if(first > second){
                weights.add(second - first);
            } else if(second > first){
                weights.add(first - second);
            }

        }
        weights.add(0);
        return Math.abs(weights.remove());
    }
}
