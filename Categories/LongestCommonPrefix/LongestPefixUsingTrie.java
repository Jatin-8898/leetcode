package LongestCommonPrefix;

class LongestPrefixUsingTrie {
	public static void main(String[] args) {
		String[] s = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String res = longestCommonPrefix(s, s.length);
        if (res.length() > 0) 
            System.out.println("The longest common prefix is " + res); 
        else 
            System.out.println("There is no common prefix");
	}

	//A Function that returns the longest common prefix from the array of strings 
	private static String longestCommonPrefix(String arr[], int n){
		return new String();
	}
}