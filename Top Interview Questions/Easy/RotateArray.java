class Solution {
    public void rotate(int[] nums, int k) {
        
        while(k-->0){
            
            int tmp = nums[nums.length-1];  //MOve last to temp
        
            for(int i = nums.length-1;  i>0;  i--)  //Shift one by one
                 nums[i] = nums[i-1];
            
            nums[0] = tmp;          //Put at 1st Pos
         }       
    }


    /* RECURSIVE */
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}