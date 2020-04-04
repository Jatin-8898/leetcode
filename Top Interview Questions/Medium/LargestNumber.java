import java.util.*;
class Solution {
    public String largestNumber(int[] num) {
      
		if(num == null || num.length == 0)
		    return "";
		
		// Convert int array to String array, so we can sort later on
		String[] strNum = new String[num.length];
		for(int i = 0; i < num.length; i++)
		    strNum[i] = String.valueOf(num[i]);
	
        
		// Comparator to decide which string should come first in concatenation
		Comparator<String> comp = new Comparator<String>(){
		    @Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;        //return true  if s1 > s2     else false
                String s2 = str2 + str1;
                return s2.compareTo(s1); // reverse order here,so we can append() later
		    }
	    };
		
		Arrays.sort(strNum, comp);
        
        // An extreme edge case by lc, say you have only a bunch of 0 in your int array
        if(strNum[0].charAt(0) == '0')
            return "0";

        
		StringBuilder sb = new StringBuilder();
		for(String s: strNum)
	        sb.append(s);
		
		return sb.toString();  
    }
}