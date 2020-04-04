class Solution {
    public String defangIPaddr(String s) {
        
        StringBuffer sb = new StringBuffer();
        for(char c: s.toCharArray()){
            if(c == '.'){
                sb.append("[.]");
                continue;
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}