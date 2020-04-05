public class MaximizeDistanceToClosestPerson {
	public static void main(String[] args) {
		int a[]  = {0,0,1,0,0,0,0,0,0,0};	
		//int a[]  = {0,0,1,0,0,0,0,0,1,0};	
		//int a[]  = {0,0,1,0,0,1,0,0,1,0};	
		System.out.println(maxDistToClosest(a));
	}

	private static int maxDistToClosest(int[] a) {
        int n = a.length;
        int max = 0;
        int i = 0;

        while(i < n){

            while(i < n && a[i] == 1){	//if its 1 then store its index
                i++;
            }
            int start = i;		//index stored in start
            

            while(i < n && a[i] == 0){ //If its 0 go ahead 
                i++;
            }

            if(start == 0 || i == n) //if the first elementis 1 and 0 is present at last eg 1,0,0,0
                max = Math.max(max, i - start);		//directly caclu by doing i-start 3-0 = 3
            else
                max = Math.max(max, (i - start + 1) / 2); //eg 0,0,1,0,0 apply (i-start+1)/2	
            
        }
        return max;
    }

}