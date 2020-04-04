import java.util.*;
class Solution {
    int[] original;
    int[] array;
    Random random;

    public Solution(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        original = array.clone();
        this.array = array;
        random = new Random();
    }

    
    
    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        for (int i = 1; i < array.length; i++) {
            int rand = random.nextInt(i + 1);//rand int from[0, i+1)exclusive.Sameas[0, i] inclusiv
            swap(array, i, rand);
        }
        return array;
    }

    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}