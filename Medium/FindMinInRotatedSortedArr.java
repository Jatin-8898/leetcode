class Solution {
    
    /* O(logn) */
    public int findMin(int[] arr) {
        
        int low = 0,    high = arr.length - 1;
		int min = -1;
	
        while (low <= high) {
			
            int mid = (low + high) / 2;
			
            if (mid == high) {
				min = arr[mid];
				break;
			}
			if (arr[mid] < arr[high]) 
				high = mid;
			else 
				low = mid + 1;
		}
        return min;
    }

    /* O(n) */
    public int findMinNotEff(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) 
            if(arr[i] <= min) 
                min = arr[i];
        
        return min;
    }
}