class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] a = {16, 19, 10, 12, 18};
        int ans = minCostClimbingStairs(a);
        System.out.println(ans);
        
    }
    public static int minCostClimbingStairs(int[] cost) {
        
        
        //The idea is to start from 2nd index and find Min of 0th & 1st Index.
        //Keep on adding the cost
        
        for(int i=2; i<cost.length; i++){
            cost[i] += Math.min(cost[i-1] , cost[i-2]);
        }
        
        //Finally the Last and the Second Last Ele of Array will hold the cost
        //So return the Min of both the cost
        
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}