class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    q.add(new int[] {i, j});
                }
            }
        }

        int INF = Integer.MAX_VALUE;

        int size = q.size();
        int dist = 1;
        while (!q.isEmpty()) {
            size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.remove();

                int row = curr[0];
                int col = curr[1];

                if (row < grid.length  - 1 && grid[row + 1][col] == INF) {
                    q.add(new int[] {row + 1, col});
                    grid[row + 1][col] = dist;
                }

                if (row > 0 && grid[row - 1][col] == INF) {
                    q.add(new int[] {row- 1, col});
                    grid[row -1][ col] = dist;
                }

                if (col < grid[0].length  - 1 && grid[row][col + 1] == INF) {
                    q.add(new int[] {row, col + 1});
                    grid[row ][col + 1] = dist;
                }

                if (col > 0 && grid[row][col - 1] == INF) {
                    q.add(new int[] {row, col - 1});
                    grid[row][col - 1] = dist;
                }
            }
            dist++;
        }
    }
}
