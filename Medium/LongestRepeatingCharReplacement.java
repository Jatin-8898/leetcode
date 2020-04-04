class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        // String s = "ABAB";
        // int k = 2;
        String s = "AABABBA";
        int k = 1;

        System.out.println(characterReplacement2(s, k));
    }

    public static int characterReplacement(String s, int k) {
        int len = s.length();
        int start = 0, maxCount = 0, maxLength = 0;
        int[] count = new int[26];

        for (int end = 0; end < len; end++) {

            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);

            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    /*
     * ANOTHER WAY
     left: left index thats in window
    right: right index thats in window
    count: character count thats in window
    uniqueCount: count of most unique characters in window
    replaceCount: number of replacement needed for all characters in window to be the same

    Each time we expand right, we include a new character in window.
    If replaceCount is bigger than k, we got an invalid window, we should skip it until window is valid again, but only expands window size, never shrink (because even if we got a smaller window thats valid, it doesn't matter because we already found a window thats bigger and valid)
     */

    public static int characterReplacement2(String s, int k) {
        int uniqueCount = 0;
        int left = 0;
        int max = 0;
        int[] count = new int[26];

        for (int right = 0; right < s.length(); right++) {

            uniqueCount = Math.max(uniqueCount, ++count[s.charAt(right) - 'A']);

            int replaceCount = right - left + 1 - uniqueCount;

            if (replaceCount > k) {
                count[s.charAt(left++) - 'A']--; // invalid window
           
            } else {
                max = Math.max(max, right - left + 1);
                System.out.println("MAX " + max);
            }
        }
        return max;
    }

}