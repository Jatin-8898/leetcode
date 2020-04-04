/*We are given two arrays A and B of words.  Each word is a string of lowercase letters.

Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".

Now say a word a from A is totalAlphabetsversal if for every b in B, b is a subset of a. 

Return a list of all totalAlphabetsversal words in A.  You can return the words in any order.

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
Output: ["facebook","google","leetcode"]

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
Output: ["apple","google","leetcode"]

*/


import java.util.*;

class WordSubsets{
	public static void main(String[] args) {
		String[] a = {"amazon","apple","facebook","google","leetcode"};
		String[] b = {"e","o"};
		WordSubsets ob = new WordSubsets();

		List<String> obj = ob.wordSubsets(a,b);
		System.out.println(obj);

	}

	private  List<String> wordSubsets(String[] A, String[] B) {
        
        int[] totalAlphabets = new int[26];
        int[] tmp;
        int i;

        for (String b : B) {
            tmp = counter(b);
            
            for (i = 0; i < 26; ++i)
                totalAlphabets[i] = Math.max(totalAlphabets[i], tmp[i]);
        }

        List<String> res = new ArrayList<>();

        for (String a : A) {
            tmp = counter(a);
 
            for (i = 0; i < 26; ++i)
                if (tmp[i] < totalAlphabets[i]) 
                	break;

            if (i == 26) 
            	res.add(a);
        }
        return res;
    }

    int[] counter(String word) {		//eg b has "e","o"
        int[] count = new int[26];
        
        for (char c : word.toCharArray()) {
        	count[c - 'a']++;			//count it ie e-a ie 101-97 = 4
        }
        return count;
    }
}