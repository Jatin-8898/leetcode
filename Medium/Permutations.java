import java.util.*;
class Solution {
 
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();       //Eg 1 2 3
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
       
        if(tempList.size() == nums.length){         //If tempList has 3 element add to Main List
            list.add(new ArrayList<>(tempList));
       
        }else{
            
            for(int i = 0; i < nums.length; i++){ 

                if(tempList.contains(nums[i]))            // element already exists, skip
                    continue; 

                tempList.add(nums[i]);
                backtrack(list, tempList, nums);

                tempList.remove(tempList.size() - 1);       //To remove 1 2 3 after 1 iteration
            }
        }
    }
}