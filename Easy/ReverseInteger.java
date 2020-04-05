class Solution {
    public int reverse(int x) {
        boolean overflowed = false;
        int result = 0;
        
        while( x != 0){
            int num = x % 10;
            x = x / 10;
            if((result * 10)/100 != result/10)//MEans overflowed
                overflowed = true;
            
            result = (result*10) + num;
        }
        return overflowed ? 0 : result;
    }
}