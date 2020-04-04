import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String cur, int open, int close, int max){
        
        if (cur.length() == max * 2) {  //Eg max = 3
            list.add(cur);               //If len becomes 6 add to List
            return;
        }

        if (open < max)                                         //Add all the (((
            backtrack(list, cur+"(", open+1, close, max);
        
        if (close < open)                                       //Add all the )))
            backtrack(list, cur+")", open, close+1, max);
    }
}