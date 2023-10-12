class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length;i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                    System.out.println(Arrays.toString(grid[0]));
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1 || 
         grid[row][col] == '0') {
            return;
        }
        if (grid[row][col] == '2') {
            return;
        }
        if (grid[row][col] == '1') {
           grid[row][col] = '2';
        }
    
        dfs(grid, row + 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row , col - 1);
        dfs(grid, row - 1, col);
        return;
    }
    
}