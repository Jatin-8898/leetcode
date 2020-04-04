 class RomanToInteger{
    public static void main(String[] args) {
        String s = "XII";  // "VII";
        int res = romanToInt(s);
        System.out.println(res);
    }   

    private static int getVal(char c){
        switch (c){     //Standards values
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X' :
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }
    
    public static int romanToInt(String s) {
        int res = 0;

        if(s.length() == 0) 
            return res;

        for (int i = 0;  i < s.length() - 1;  i++) { // for ip XII
            
            //2 pointers curr and nex
            int cur = getVal(s.charAt(i));  //here 10
            int nex = getVal(s.charAt(i+1));    //here 1

            if(cur < nex)  //Subtract
                res -= cur;
            else          //Add so it becomes 11 
                res += cur; 
            
        }
        return res + getVal(s.charAt(s.length()-1));    //Add 11 + 1 = 12
    }
}