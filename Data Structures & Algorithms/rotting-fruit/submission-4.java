class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] {i, j});
                } else if (grid[i][j] ==1) {
                    fresh++;
                }
            }
        }

        if (q.isEmpty() && fresh != 0) {
            return -1;
        }

        int minutes = 0;
        boolean rtm = false;

        while (!q.isEmpty()) {
            int size = q.size();
            rtm = false;
            for (int i = 0; i < size; i++) {
                int[] curr = q.remove();

                int row = curr[0];
                int col = curr[1];

                if ( row < grid.length - 1 && grid[row+1][col] == 1) {
                    grid[row+1][col] = 2;
                    q.add(new int [] {row + 1, col});
                    rtm = true;
                    fresh--;
                } 
                if ( col > 0 && grid[row][col - 1] == 1) {
                    grid[row][col - 1] = 2;
                    q.add(new int [] {row, col -1});
                    rtm = true;
                    fresh--;
                } 
                if ( row > 0 && grid[row - 1][col] == 1) {
                    grid[row-1][col] = 2;
                    q.add(new int[] {row - 1, col});
                    rtm = true;
                    fresh--;
                } 
                if ( col < grid[0].length - 1 && grid[row][col +1] == 1) {
                    grid[row][col+1] = 2;
                    q.add(new int[] {row, col +1});
                    rtm = true;
                    fresh--;
                }
            }
            if (rtm) {
                minutes++;
            }
            
            
        }
        if (fresh != 0) {
            return -1;
        }
        return minutes;
    }
}
