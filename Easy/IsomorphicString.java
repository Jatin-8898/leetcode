package String;

import java.util.*;

class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {

        // Base code
        if (s == null || s.length() <= 1)
            return true;

        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a).equals(b))
                    continue;
                else
                    return false;

            } else {
                if (!map.containsValue(b))
                    map.put(a, b);
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicString obj = new IsomorphicString();
        if(obj.isIsomorphic("xxy", "aab") == true)
            System.out.println("ARE ISOMORPHIC");
        else
            System.out.println("NOT");
    }

    /* More better approach
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        
        if(s==null) 
            return true;
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            } else{
                if(set.contains(t.charAt(i))) return false;
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    */
}