public class NumberOf1Bit {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        
        //1 way of doing
        //return Integer.bitCount(n);
        

        //2nd way of doing
        /*int count = 0;
            
        while(n != 0){
            n = n & (n - 1);
            count++;
        }

        return count;*/
        
        //3rd way of doing
        int bits = 0;
        int mask = 1;
        
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}