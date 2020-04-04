class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l  = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i]) - 1;     //Since 0 based Index
            
            //If already negative dont do anything coz its repeating number
            if(nums[val] > 0)       //Only if its Positive No. mark it as Negative
                nums[val] = -nums[val];
        }
        
        for(int i = 0; i < nums.length; i++) 
            if(nums[i] > 0)     
                l.add(i+1);     //Since 0 based index therefore i+1 
        
        return l;
        
    }
}