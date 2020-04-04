package Median;

class MedianOfSortedArray{
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,4};
		double res = findMedianSortedArrays(a,b);
		System.out.println(res);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        double res1 = 0.0, res2 = 0.0;

        if ((m + n) % 2 == 1) {
        	System.out.println("ODD");
            for (int x = 0; x <= (n + m) / 2; x++) {

                if (i != n && j != m) {
                    res1 = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];

                } else if (i < n) {
                    res1 = nums1[i++];
                } else
                    res1 = nums1[j++];
            }
            return res1;

        } else {
        	
            for (int x = 0; x <= (n + m) / 2; x++) {
                res2 = res1;
                System.out.println(res2);

                if (i != n && j != m) {
                    res1 = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];

                } else if (i < n) {
                    res1 = nums1[i++];
                } else
                    res1 = nums1[j++];
            }
            return (res1 + res2) / 2;
        }
    }
}