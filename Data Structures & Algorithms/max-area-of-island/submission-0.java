class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                max = Math.max(dfs(grid, row, col), max);
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length) {
            return 0;
        }

        if (col < 0 || col >= grid[0].length) {
            return 0;
        }

        if (grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0;

        return 1 +         dfs(grid, row - 1, col)
        + dfs(grid, row, col -1)
         + dfs(grid, row + 1, col)
         + dfs(grid, row, col + 1);
    }
}
