class Solution {

    public boolean isPalindrome(String s) {
            
        //Replace all the chars which r not a-zA-Z0-9 and make everything LowerCase
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        
        //Rev and check if same return true
        String rev = new StringBuffer(actual).reverse().toString();
        
        return actual.equals(rev);
    }
}