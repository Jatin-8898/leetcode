package LongestCommonPrefix;
class LongestPrefixCharByChar{
	/*
		Now there is no common prefix string of the above strings. By the "Word by Word Matching" algorithm  we come to the conclusion that there is no common prefix string by traversing all the strings. 
		
		But if we use this algorithm, then in the first iteration itself we will come to know 
		that there is no common prefix string, 
		as we don’t go further to look for the second character of each strings.

		This algorithm has a huge advantage when there are too many strings.
		O(N M) 
	*/
	/* public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		int n = arr.length;
		String ans  = longestPrefixCharByChar(arr,n);
		if(ans.length() > 0)
			System.out.println(ans);
		else
			System.out.println("NO COMMON PREFIX");
	} */




	/* private static String longestPrefixCharByChar(String[] arr, int n){
		int minLen = findMinLength(arr,n);

		StringBuffer result = new StringBuffer();
		char current;

		for (int i = 0; i< minLen; i++) {
			char str  = arr.toCharArray();
			current = str.substring(0,i);

			for (int j=1 ; j<n; j++) 
            	if (str.substring(j,i) != current) 
                	return result.toString(); 
  
        	// Append to result 
        	result.append(current); 	
		}
		return result.toString();
	} */



	/* private static int findMinLength(String[] arr, int n){
		//here arr[0] means geeksforgeeks and arr[1] means geeks 
		//So we need to find the minLen which is 4 ie "geek"
		int min = arr[0].length();

		for (int i=1; i<n; i++) {
			
			if(arr[i].length() < min)
				min = arr[i].length();		//geek, ie Updating the min value of Length
		}

		return min;
	} */
}


/*//  A C++ Program to find the longest common prefix 

#include<bits/stdc++.h> 
using namespace std; 
  
// A Function to find the string having the minimum 
// length and returns that length 
int findMinLength(string arr[], int n) 
{ 
    int min = arr[0].length(); 
  
    for (int i=1; i<n; i++) 
        if (arr[i].length() < min) 
            min = arr[i].length(); 
  
    return(min); 
} 
  
// A Function that returns the longest common prefix 
// from the array of strings 
string commonPrefix(string arr[], int n) 
{ 
    int minlen = findMinLength(arr, n); 
  
    string result; // Our resultant string 
    char current;  // The current character 
  
    for (int i=0; i<minlen; i++) 
    { 
        // Current character (must be same 
        // in all strings to be a part of 
        // result) 
        current = arr[0][i]; 
  
        for (int j=1 ; j<n; j++) 
            if (arr[j][i] != current) 
                return result; 
  
        // Append to result 
        result.push_back(current); 
    } 
  
    return (result); 
} 
  
// Driver program to test above function 
int main() 
{ 
    string arr[] = {"geeksforgeeks", "geeks", 
                    "geek", "geezer"}; 
    int n = sizeof (arr) / sizeof (arr[0]); 
  
    string ans = commonPrefix (arr, n); 
  
    if (ans.length()) 
        cout << "The longest common prefix is "
             << ans; 
    else
        cout << "There is no common prefix"; 
    return (0); 
} */