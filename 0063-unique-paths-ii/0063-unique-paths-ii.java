class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) return 0;
        if (obstacleGrid[0][0] == 1) return 0;
        obstacleGrid[0][0] = -1;
        for (int i = 1; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) continue;
            if (obstacleGrid[i - 1][0] == 1) {
                obstacleGrid[i][0] = 1;
                continue;
            }
            obstacleGrid[i][0] = -1;
        }
        for (int i = 1; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) continue;
            if (obstacleGrid[0][i - 1] == 1) {
                obstacleGrid[0][i] = 1;
                continue;
            }
            obstacleGrid[0][i] = -1;
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                else {
                    if (obstacleGrid[i - 1][j] < 0 && obstacleGrid[i][j - 1] < 0) {
                        obstacleGrid[i][j] = (obstacleGrid[i - 1][j]) + (obstacleGrid[i][j - 1]); 
                    }
                    else if (obstacleGrid[i - 1][j] < 0  && obstacleGrid[i][j - 1] > 0) {
                        obstacleGrid[i][j] = (obstacleGrid[i - 1][j]); 
                    }
                    else if (obstacleGrid[i - 1][j] > 0  && obstacleGrid[i][j - 1] < 0) {
                        obstacleGrid[i][j] =  (obstacleGrid[i][j - 1]); 
                    }
                    else {
                        obstacleGrid[i][j] = 1;
                    }
                   
                }
            }
        }
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] > 0) return 0;
        return Math.abs(obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1]);
    }
 
}