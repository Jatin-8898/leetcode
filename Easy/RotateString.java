class Solution {
    public boolean rotateString(String A, String B) {
        
        if(areRotation(A,B))
			return true;
		else
			return false;
	}
    
	private static boolean areRotation(String s1, String s2){

		/*Check if the length is equal or not*/
		int len1 = s1.length();
		int len2 = s2.length();

		if(len1 != len2)
			return false;

		//Concat s1 with s1 ie temp
		//if s2 is subString of temp then its Rotation of s1
		return((s1+s1).indexOf(s2) != -1);
    }
}