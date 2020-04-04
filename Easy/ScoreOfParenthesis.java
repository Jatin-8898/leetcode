import java.util.*;
class ScoreOfParenthesis{
	public static void main(String[] args) {
		String s = "()()";
		System.out.println(scoreOfParentheses(s));			
	}

	public static int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        
        for(char c: S.toCharArray()){
            if(c == '('){
                stack.push(-1);
            }
            else{
                int curr = 0;
                while(stack.peek() != -1)
                    curr = curr + stack.pop();
            
                stack.pop();
                stack.push(curr ==0 ? 1  : curr *2);
            }
            
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    
    }
}
