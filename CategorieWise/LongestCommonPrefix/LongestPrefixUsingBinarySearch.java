package LongestCommonPrefix;
class LongestPrefixUsingBinarySearch{

    /*Steps:

    Find the string having the minimum length. Let this length be L.

    Perform a binary search on any one string (from the input array of strings). Let us take the first string and do a binary search on the characters from the index – 0 to L-1.
    
    Initially, take low = 0 and high = L-1 and divide the string into two halves – left (low to mid) and right (mid+1 to high).
    
    Check whether all the characters in the left half is present at the corresponding indices (low to mid) of 
    all the strings or not. If it is present then we append this half to our prefix string and we look in the right half in a hope to find a longer prefix.(It is guaranteed that a common prefix string is there.)
    
    Otherwise, if all the characters in the left half is not present at the corresponding indices (low to mid) in all the strings, then we need not look at the right half as there is some character(s) in the left half itself which is not a part of the longest prefix string. So we indeed look at the left half in a hope to find a common prefix string. (It may be possible that we don’t find any common prefix string)
    
    The recurrence relation is

    T(M) = T(M/2) + O(MN) 
    where

    N = Number of strings
    M = Length of the largest string string
    So we can say that the time complexity is O(NM log M)
*/


    public static void main(String[] args) {
        
        String[] s = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String res = longestCommonPrefix(s, s.length);
        if (res.length() > 0) 
            System.out.println("The longest common prefix is " + res); 
        else 
            System.out.println("There is no common prefix");

        /*["flower","flow","flight"]
        Output: "fl"
        
        ["dog","racecar","car"]
        Output: ""

        */
    }


    public static String longestCommonPrefix(String[] strs, int n) {
        if (strs == null || strs.length == 0)
            return "";

        int minLen = Integer.MAX_VALUE; //assume 1000k

        /*First find the minlength str in the string array.*/
        for (String str : strs)                         //here the str is geeksforgeeks, geeks, geek, geezer
            minLen = Math.min(minLen, str.length());    //geek


        /*Now we apply the binary search and check for the common prefix*/
        int low = 0;            //eg low is at g
        int high = minLen;      //high is at k
        String prefix = "";     //Result string

        while (low <= high) {       
            
            //Same as (low + high)/2, but avoids  overflow for large low and high 
            int middle =  low + (high - low) / 2;          //at 2nd index 'e'


            if (allContainsCommonPrefix(strs, n, strs[0], low, middle)){
                
                prefix = prefix + strs[0].substring(0, middle+1);   //append it to ans & move ahead
                low = middle + 1;           //Go in the right part of string           

            
            }else
                high = middle - 1;
        }

        return (prefix); 
    }




    private static boolean allContainsCommonPrefix(String[] strs, int n, String str, int start, int end){

        for (int i = 0; i <=(n-1); i++){
            String current = strs[i];

           for (int j = start; j <= end; j++) 
                if (current.charAt(j) != str.charAt(j)) 
                    return false;
        }        
        return true;
    }
}