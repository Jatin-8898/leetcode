class Solution {
    
    /* BEST SOLUTION 
        TIME : O(n)
        SPACE: O(1)
    */
    public int robEff(int[] nums) {
        if (nums.length == 0) return 0;
        
        int prev1 = 0;
        int prev2 = 0;
        
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        
        return prev1;
    }

    /* ANOTHER WAY */
    public int rob(int[] nums) {    //Eg 2, 7 ,9 ,3 ,1 

        int n = nums.length;        //n=5
        
        if (n == 0) return 0;
        
        if (n == 1) return nums[0];
        
        if (n > 2)                          //9+2 = 11
            nums[2] += nums[0];             //Arr becomes 2 7 11 3 1
        

        for (int i = 3; i < n; i++)             //num[3] = 3 + Max(7,2) => 10,   Arr [2 7 11 10 1]
            nums[i] += Math.max(nums[i-2], nums[i-3]);  //num[4] = 1 + Max(11,7) =>  12
        

        return Math.max(nums[n-1], nums[n-2]);  //Max(12,10)  => return 12 correct ans
    }


    /* ANOTHER APPROACH */
    public int rob2(int[] nums) {
        if (nums.length == 0) return 0;
        
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }
        
        return memo[nums.length];
    }
}