class Solution {
    
    public String toGoatLatin(String S) {
        
        StringBuilder sb = new StringBuilder();
        String noOfA = "";
        
        for(String s : S.split(" ")){
            
            if(isVowel(s.charAt(0))) {  //If vowel simply append it
                sb.append(s);
            }
            
            else {                  //Else put at the end of string
                char c = s.charAt(0);
                sb.append(s.substring(1, s.length()));
                sb.append(c);
            }
            
            noOfA += "a";           //Everytime it will increase by 1 a and so on..
            
            sb.append("ma").append(noOfA).append(" ");
            
        }
        
        return sb.toString().trim();
    }
    
    private static boolean isVowel(char c){
        return (c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||
                c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
    
}