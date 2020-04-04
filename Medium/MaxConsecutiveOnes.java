class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int a[] = {1,1,1,0,0,0,1,1,1,1,0}, K = 2;
        System.out.println( longestOnes(a,K));
    }
    public static int longestOnes(int[] A, int K) {
        
        int start = 0, end;
        
        for (end = 0; end < A.length; end++) {  //1,1,1,0,0,0,1,1,1,1,0

            if (A[end] == 0) {
                K--;
                //System.out.println("DECR "+ K + " Found at "+ end);
            }
            
            if (K < 0 && A[start++] == 0) {
                K++;
               // System.out.println("INCR K "+ K + " Start Index "+ start + " end Index "+end);
            }
              
        }
        //System.out.println(end + " " + start);
        
        return end - start;     //Since end is from 0 to 10 => 11 and start is at 5 => 11-5 = 6
        
    }

    
    /* ANOTHER WAY */
    public int longestOnesAnother(int[] A, int K) {
        
        int res = 0,start = 0, flips = 0;

        for (int i = 0; i < A.length; ++i) {
            flips += 1 - A[i];
          
            while (flips > K) 
                if (A[start++] == 0) 
                    flips--;

            res = Math.max(res, i - start + 1);
        }
        return res;
    }

    /* ANOTHER WAY */
    public int longestOnesAnother2(int[] A, int K) {
        int zeroCount=0,start=0,res=0;
        
        for(int end=0; end<A.length; end++){
            
            if(A[end] == 0) 
                zeroCount++;
            
            while(zeroCount > K){
                if(A[start] == 0) zeroCount--;
                start++;
            }

            res = Math.max(res,end-start+1);
        }
        return res;
    }
}