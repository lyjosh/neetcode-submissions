class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Stack<int[]> s = new Stack<>();
        int[][] arr = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            arr[i] = new int[] {position[i], speed[i]};
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(b[0], a[0]));
    
        double lastFleet = 0;
        int fleets = 0;
        for (int i = 0; i < position.length; i++) {
            double time = (double)(target - arr[i][0]) / arr[i][1];

            if (time > lastFleet) {
                fleets++;
                lastFleet = time;
            }

        }
        return fleets;
    }
}
