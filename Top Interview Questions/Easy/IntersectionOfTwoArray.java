import java.util.*;

class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        Integer res[] = intersect(nums1, nums2);
        for(int i: res) System.out.println(i);
    }

    public static Integer[] intersect(int[] nums1, int[] nums2) {
        
        // freq count for nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums1) 
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        // collect result
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num: nums2) {
            
            if (map.containsKey(num)){
                result.add(num);
                map.put(num, map.get(num) - 1);
                map.remove(num, 0);
            }
        }
        
       Integer[] res = result.toArray(new Integer[result.size()]); 
       
       // convert result            MANUAL WAY OF CONVERTING TO INT[]
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++) {
           r[i] = result.get(i);
       }

       return res;
    }
}