package String;

import java.util.*;
public class WordPattern{
    public static void main(String[] args) {
        String pattern  = "abba";
        String str  = "dog dog dog dog";
        if(isWordPattern(pattern,str))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");    
    }    

    public static boolean isWordPattern(String pattern, String str){
        
        String[] arr = str.split(" ");  
    
        //prevent out of boundary problem
        if(arr.length != pattern.length())
            return false;
    
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            
            if(map.containsKey(c)){     //if already present
                
                String value = map.get(c);
                
                if(!value.equals(arr[i]))      //if value doesn't mtches with str eg b=dog
                    return false;
            
            }else if (map.containsValue(arr[i])){
                return false;
            }

            map.put(c, arr[i]);
        }
    
        return true;
    }
}