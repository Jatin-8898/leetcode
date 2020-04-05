class GrumpyBookstoreOwner {
   
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int sum = 0, maxWindow = 0, window = 0;
        
        for (int i = 0; i < customers.length; ++i) {
   
            sum += grumpy[i] == 0 ? customers[i] : 0;
            
            window += grumpy[i] == 1 ? customers[i] : 0;
            
            if (i >= X) 
                window -= grumpy[i - X] == 1 ? customers[i - X] : 0;
            
            maxWindow = Math.max(maxWindow, window);
        }
        
        return sum + maxWindow;
    }
    /* ANOTHER WAY */
    public int maxSatisfied2(int[] customers, int[] grumpy, int X) {
        int satisfied = 0;
        int[] window = new int[customers.length];
        int left = 0;
        int right = 0;
        int max = 0;
        int windowSum = 0;

        for (int i = 0; i < customers.length; i++) {

            if (grumpy[i] == 1) {
                windowSum += customers[i];
                window[right] = customers[i];
                satisfied += 0;
            } else {
                window[right] = 0;
                satisfied += customers[i];

            }


            if (right >= X) {
                windowSum -= window[left];
                left++;
            }
            if (windowSum > max) {
                max = windowSum;
            }
            right++;

        }
        return satisfied + max;
    }

}