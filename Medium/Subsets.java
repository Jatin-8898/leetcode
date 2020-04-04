import java.util.*;
class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list  = subsets(nums);
        for(List<Integer> i: list){
            System.out.println(i);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        backtrack(list, new ArrayList<>(), nums, 0);    //Eg [1 2 3]
        
        return list;
    }

    private  static  void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        
        list.add(new ArrayList<>(tempList));        //For adding []
        
        for(int i = start; i < nums.length; i++){
        
            tempList.add(nums[i]);                  // [1]  [1,2]  [1,2,3]
            
            backtrack(list, tempList, nums, i + 1);
            
            tempList.remove(tempList.size() - 1);
            
            /*To generate all possible permutations, we need to remove the least recently added element while we are going up the recursive call stack.
            In the first iteration of the for loop we add all permutations, that start with nums[0]
            
            Then, before we can begin building all permutations starting with nums[1], we need to clear the tempList (which currently contains permutations from the first iteration of the for loop) - that's exactly what "tempList.remove(tempList.size() - 1)" does.*/
        }
    }
}