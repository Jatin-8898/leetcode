class Parenthesis {
    public static void main(String[] args) {
        
    }    
    public boolean isValid(String s) {
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s12 = 0;
        int s13 = 0;
        int s21 = 0;
        int s23 = 0;
        int s31 = 0;
        int s32 = 0;
        
        for (int i = 0; i <= s.length() - 1; i++)
        {
            char x = s.charAt(i);
            switch (x) {
                case '(': 
                    s12 = s12 + s2 + 1;
                    s13 = s13 + s3 + 1;
                    s1 = s1 + 1;
                    break;
                case '{': s21 = s21 + s1 + 1;
                          s23 = s23 + s3 + 1;
                          s2 = s2 + 1;
                    break;
                case '[': s31 = s31 + s1 + 1;
                          s32 = s32 + s2 + 1;
                          s3 = s3 + 1;
                    break;
                case ')': s12 = s12 - s2 - 1;
                          s13 = s13 - s3 - 1;
                          s1 = s1 - 1;
                    break;
                case '}': s21 = s21 - s1 - 1;
                          s23 = s23 - s3 - 1;
                          s2 = s2 - 1;
                    break;
                case ']': s31 = s31 - s1 - 1;
                          s32 = s32 - s2 - 1;
                          s3 = s3 - 1;
                    break;
                default:
                    break;
            }
            if (s12 < 0 || s13 < 0 || s21 < 0 || s23 < 0 || s31 < 0 || s32 < 0 || s1 < 0 || s2 < 0 || s3 < 0)
                return false;
        }
        return (s12 == 0 && s13 == 0 && s21 == 0 && s23 == 0 && s31 == 0 && s32 == 0 && s1 == 0 && s2 == 0 & s3 == 0);
    }
}



/*******************ANother Solution****************
public boolean isValid(String s) {
    if(s.length()==0) return true;
    char first = s.charAt(0);
    
    char[][] pairs = new char[][]{ {'(',')'},{'{' ,'}' },{ '[',']' } };
    
    int[] count = new int[3];
    
    
    for(int index=0; index< s.length(); index++){
        char c = s.charAt(index); 
        
        for(int i=0; i<3 ; i++){
            if(c==pairs[i][0]){
                count[i]++;
            }else if(c==pairs[i][1]){
                count[i]--;
                if(count[i] == 0 && pairs[i][0]==first ){
                    for(int num : count){
                        if(num!=0) return false;
                    }
                    // return isValid(s.substring(index+1,s.length()));
                    if(index+1<s.length()){
                        first = s.charAt(index+1);
                    }
                    
                }
                
                if(count[i]<0) return false;
            }
            
        }
    
        
    }
    for(int num : count){
        if(num!=0) return false;
    }
    return true;
    
}

***************USING STACK***********************

public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
        if (c == '(')
            stack.push(')');
        else if (c == '{')
            stack.push('}');
        else if (c == '[')
            stack.push(']');
        else if (stack.isEmpty() || stack.pop() != c)
            return false;
    }
    return stack.isEmpty();
}
*/