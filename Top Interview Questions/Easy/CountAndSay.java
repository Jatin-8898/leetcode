class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }

    public  static String countAndSay(int n) {// Eg 3 ie 21
        
        String s = "1";
        
        for (int i = 1; i < n; i++) {
        
            StringBuilder sb = new StringBuilder();
            
            for (int j = 1, count = 1;    j <= s.length();   j++) {
            
                if (j == s.length() || s.charAt(j - 1) != s.charAt(j)) {
                    
                    //System.out.println("IN IF " + s + " SB " +sb);
                    sb.append(count);
                    sb.append(s.charAt(j - 1));
                    count = 1;
                    //System.out.println("IN IF END " + s + " SB: " +sb + " co: "+count);
                
                } else {
                    count++;
                }
            }
            
            s = sb.toString();
        }
        return s;
    }
}