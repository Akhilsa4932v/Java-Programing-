//The task is to count all the possible paths from top left to bottom right of a m X n matrix with the constraints that from each cell you can either move only to right or down.

public class Numberofpaths {

    public int numberOfPaths(int m, int n) {
        
        int dp[][] = new int[m][n];
        
        for(int i=0;i<dp.length;i++) dp[i][0] = 1;
        for(int j=0;j<dp[0].length;j++) dp[0][j] = 1;
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        
        return dp[m-1][n-1];
    }
}
    

