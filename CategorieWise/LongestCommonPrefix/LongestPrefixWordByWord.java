package LongestCommonPrefix;

class LongestPrefixWordByWord{
	/*
		This is actually a very naive approach since it 
		compares 2 strings at a time and word by word if it matches returns the matched chars
		Complexity:  O(N M) 
	*/
	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		int n = arr.length;
		String ans  = longestPrefixWordByWord(arr,n);
		if(ans.length() > 0)
			System.out.println(ans);
		else
			System.out.println("NO COMMON PREFIX");
	}




	private static String longestPrefixWordByWord(String[] arr, int n){
		String prefix = arr[0];

		for (int i=1; i<n-1; i++) 
			prefix = longestPrefixWordByWordUtil(prefix, arr[i]);

		return (prefix);
	}



	private static String longestPrefixWordByWordUtil(String s1, String s2){
		StringBuffer res = new StringBuffer();
		int l1 = s1.length();
		int l2 = s2.length();

		for (int i=0 , j=0;  i<=l1-1 &&j<=l2-1 ; i++,j++) {
			if(s1.charAt(i) != s2.charAt(j))		//If they r not same come out of the  loop
				break;

			res.append(s1.charAt(i));			//put in the string buffer
		}

		return (res.toString());
	}
}