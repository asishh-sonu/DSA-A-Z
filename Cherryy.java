public class Cherryy {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][][] dp = new int[rows][cols][cols];
        
        for (int i = rows - 1; i >= 0; i--) {
            for (int j1 = 0; j1 < cols; j1++) {
                for (int j2 = 0; j2 < cols; j2++) {
                    int cherries = grid[i][j1];
                    if (j1 != j2) {
                        cherries += grid[i][j2];
                    }
                    if (i != rows - 1) {
                        int maxCherries = 0;
                        for (int nj1 = j1 - 1; nj1 <= j1 + 1; nj1++) {
                            for (int nj2 = j2 - 1; nj2 <= j2 + 1; nj2++) {
                                if (nj1 >= 0 && nj1 < cols && nj2 >= 0 && nj2 < cols) {
                                    maxCherries = Math.max(maxCherries, dp[i + 1][nj1][nj2]);
                                }
                            }
                        }
                        cherries += maxCherries;
                    }
                    dp[i][j1][j2] = cherries;
                }
            }
        }
        
        return dp[0][0][cols - 1];
    }
}
