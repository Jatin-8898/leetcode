class Solution {
    public int majorityElement(int[] num) {
        
        int major = num[0], count = 1;
        
        for(int i=1; i<num.length;i++){     //1, 3, 1, 1, 2, 1
            
            if(count == 0){
                count++;
                major = num[i];
            
            }else if(major == num[i]){
                count++;
            
            }else 
                count--;
        }
        return major;
    }
}