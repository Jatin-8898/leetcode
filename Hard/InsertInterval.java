import java.util.*;
class InsertInterval{    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if ((intervals.length == 0) || (intervals[0].length == 0))
            return new int[][]{newInterval};

        List<int[]> ints = new ArrayList<>(Arrays.asList(intervals));

        ints.add(searchInsertPosition(intervals, newInterval), newInterval);

        return mergeIntervals(ints).toArray(new int[][]{{0}});
    }

    // 	LC 35 Search Insert Position    
    private int searchInsertPosition(int[][] intervals, int[] newInterval) {
        int target = newInterval[0];

        if (target <= intervals[0][0])
            return 0;

        if (target >= intervals[intervals.length - 1][0])
            return intervals.length;

        int low = 0;
        int high = intervals.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (intervals[mid][0] == target)
                return mid;
            
            if (intervals[mid][0] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    // LC 56 Merge Intervals
    private List<int[]> mergeIntervals(List<int[]> ints) {

        List<int[]> merged = new ArrayList<>();
        int[] lastInt = ints.get(0);
        merged.add(lastInt);

        for (int i = 1; i < ints.size(); i++) {
            int[] currInt = ints.get(i);

            if (currInt[0] <= lastInt[1]) {
                lastInt[1] = Math.max(lastInt[1], currInt[1]);

            } else {
                merged.add(currInt);
                lastInt = currInt;
            }
        }
        return merged;
    }
}