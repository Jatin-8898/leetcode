import java.util.*;
class HappyNumber {
    public static void main(String[] args) {
        isHappy(19);
    }
    public static boolean isHappy(int n) {
        
        if(n < 10) {
            
		    if(n==1||n==7) 
                return true;
		    else 
                return false;
	    }
        
        int b;
        int sum=0;
        
        while(n > 0) {
              b = n % 10;
              sum = sum + b*b; 
              n = n / 10;
        } 
        
         return isHappy(sum);
    }


    /* ANNOTHER SOLUTION */
    public boolean isHappy2(int n) {
        Set<Integer> set = new HashSet<>();
        while(getSquareSum(n) != 1){
             n = getSquareSum(n);
            if(!set.add(n))return false; 
        }
        return true;
    }
    
    private int getSquareSum(int n){
        int result = 0;
        while(n != 0){
            result += Math.pow(n%10,2); 
            n = n/10;
        }
        return result; 
    }
}