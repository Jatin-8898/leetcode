class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        
        for(int i = 1; i < prices.length; i++) {
            
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            System.out.println("MAXCUR: "+maxCur+ " "+ i );

            maxSoFar = Math.max(maxCur, maxSoFar);
            System.out.println("MAXSOFAR: "+maxSoFar+ " "+ i );
        }
        
        return maxSoFar;

        
    }
    public static int maxProfitEff(int[] prices){
        int min = Integer.MAX_VALUE, 
            max = 0;
        
        for (int c: prices) {
            min = Math.min(c, min);
            max = Math.max(max, c - min);
        }
        return max;
    }
}