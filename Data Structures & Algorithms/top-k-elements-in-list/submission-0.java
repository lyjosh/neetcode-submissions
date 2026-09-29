class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
            } else {
                count.put(nums[i], count.get(nums[i])+1);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a,b) -> {
                return Integer.compare(b[1],a[1]);
            }
        );

        for (int curr : count.keySet()) {
            heap.add(new int[] {curr, count.get(curr)});
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int[] curr = heap.poll();
            res[i] = curr[0];
        }

        return res;


        
    }
}
