class JumpGame {
    public static void main(String[] args) {
        int[] a = {2,3,1,1,4}; 
        if (canJump(a)) 
            System.out.println("true");
        else
            System.out.println("false");

    }
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0;
        
        for(int i=0; i <= max; i++){
            
            max = Math.max(max, i + nums[i]);
            System.out.println("MAX "+max + " "+i+ " " +nums[i]);

            if(max >= len-1)  
                return true;
        }
        
        return false;
    }
}