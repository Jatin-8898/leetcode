class Solution {
    public int countPrimes(int n) {
        
        boolean[] notPrime = new boolean[n];    //Initially everything is false
        int count = 0;
        
        for (int i = 2; i < n; i++) {//Eg 10
        
            if (notPrime[i] == false) { //2 is prime incr count
                count++;
            
                for (int j = 2; i*j < n; j++) { //For 2 4 6 8 marks as NotPrime
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
        
    }
}