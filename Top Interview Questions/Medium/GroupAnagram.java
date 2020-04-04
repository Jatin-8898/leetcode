import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (String s : strs) {             //["eat", "tea", "tan", "ate", "nat", "bat"],
            
            char[] ca = s.toCharArray();        //will give [ e a t ]
            
            Arrays.sort(ca);
            String key = String.valueOf(ca);        

            if (!map.containsKey(key))              //Add the sorted ie aet as key
                map.put(key, new ArrayList<>());
            
            map.get(key).add(s);                    //Add the original eat as Value in the key aet
        }
        
        return new ArrayList<>(map.values());           //Return all the values
        //Since we want to return List<List<String>>
        //Map.values() will return List<String> & Arraylist will return <List> of this List<String>
    }

    /* ANOTHER WAY OF DOING */
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s: strs){
            int[] arr = new int[26];
        
            for(int i = 0;i<s.length();i++){
                arr[s.charAt(i) - 'a']++;
            }
        
            String key = Arrays.toString(arr);
            List<String> tempList = map.getOrDefault(key, new LinkedList<String>());
            tempList.add(s);
            map.put(key,tempList);
        }
        
        return new LinkedList<>(map.values());
    }
}