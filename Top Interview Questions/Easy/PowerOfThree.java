public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        
        //return Integer.toString(n, 3).matches("^10*$");
        
        
        /*FASTEST SOLUTION
        Knowing the limitation of n, we can now deduce that the maximum value of n that is            also a power of three is 1162261467. We calculate this as:
            3^|logMaxInt| = 3^|19.56| = 3^19 = 1162261467
        */
        return n > 0 && 1162261467 % n == 0;
        
        
        
        /* 3rd WAY OF DOIN
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;*/
    }
}