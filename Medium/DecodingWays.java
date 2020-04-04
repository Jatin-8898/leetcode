class DecodingWays {
    
    public static int numDecodings(String s) {
        
        if(s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        
        for(int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));
        
            if(first >= 1 && first <= 9) {
               dp[i] += dp[i-1];  
            }
            
            if(second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(s.nextLine());
            String st = s.nextLine();
            System.out.println(numDecodings(st));
        }
    
    }
}