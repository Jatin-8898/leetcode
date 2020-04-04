class MoveZeroes {
    public void moveZeroes(int[] nums) {
        
        if (nums == null || nums.length == 0) return;        

        int pos = 0;
        
        for (int num: nums) {   //Skip the Zeroes & put the Non zeroes in Arr.
            if (num != 0) 
                nums[pos++] = num;
        }        

        while (pos < nums.length) { //Now Place all the zeroes
            nums[pos++] = 0;
        }
    }
}