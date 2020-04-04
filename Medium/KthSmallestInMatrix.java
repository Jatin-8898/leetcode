class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int  lo = matrix[0][0], 
        hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;//[lo, hi)
    
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0,  
                j = matrix[0].length - 1;
            
            for(int i = 0; i < matrix.length; i++) {
                while(j >= 0 && matrix[i][j] > mid) 
                    j--;
                count += (j + 1);
            }
            
            if(count < k) 
                lo = mid + 1;
            else 
                hi = mid;
        }
        return lo;
    }

    public int kthSmallestPassesPartialCases(int[][] matrix, int k) {
    
        int dup = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++){
                if(!set.contains(matrix[i][j]))
                    set.add(matrix[i][j]);
                else
                    dup++;
            }
                
        for(int i=0; i<k-dup-1; i++)
            set.pollFirst();
        
        return set.first();
    }
}