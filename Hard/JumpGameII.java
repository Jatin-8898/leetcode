class JumpGameII {
    public static void main(String[] args) {
        int[] a = {2,3,1,1,4}; 
        System.out.println(jump(a));
    }
    public static int jump(int[] A) {
        //This is an implicit bfs solution. i == curEnd means you visited all the items on the current level. Incrementing jumps++ is like incrementing the level you are on. And curEnd = max is like getting the queue size (level size) for the next level you are traversing. 
        
        int jumps = 0, 
            curEnd = 0, 
            max = 0;
        
        //i < A.length - 1 BECAUSE The last number doesn't need to be traversed. The question just needs to reach to the last number, then it ends and then outputs the result.
        
        for (int i = 0; i < A.length - 1; i++) {
        
            max = Math.max(max, i + A[i]);
            //System.out.println("MAX "+max + " "+i+ " " +A[i]);

            if (i == curEnd) {
                jumps++;
                curEnd = max;
                //System.out.println("JUMPS "+jumps+" " +curEnd);
            }
        }
        
        return jumps;
    }
}