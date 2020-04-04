class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int rows, int cols) {
        
        int[] dp = new int[cols];

        for(int i=0;i<cols;i++)
            dp[i] = 1;            

        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                dp[j] = dp[j-1] + dp[j];
                //System.out.println("SET "+j+" "+dp[j]);
            }
        }
        
        return dp[cols-1];
        
    }
}