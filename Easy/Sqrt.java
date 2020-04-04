class Solution {
    public int mySqrt(int x) {
        long r = x;                 //Eg 4
        
        while (r*r > x)             // Eg r*r = 16
            r = (r + x/r) / 2;      //4 + 4  = 8/2  = 4
        
        return (int) r;
    }
}