class Solution{
    
    public int trailingZero(int n) { //Eg 25
    
        return n == 0   ? 0 :    (n/2 +  trailingZero(n/2));
        
        //25/2 = 5 + (25/2)     =>    5 + 1 = 6
    
    }
}