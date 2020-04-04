class Solution {
    public int findDuplicate(int[] nums) {
        
        /* 1st Method
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1; */
        
        
        /* 2nd Method
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1; */
        
        /*  3rd Method Efficient
        Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        
        do {
            tortoise = nums[tortoise];  
            hare = nums[nums[hare]];
       
        } while (tortoise != hare);

        
        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
        
        */
        

        //Easy to Understand same as Hare Tortoise
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        
        }while(slow != fast);
        
        slow = 0;
        
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
    }
}