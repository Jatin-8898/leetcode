import java.util.*;
class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>(n);
        
        for(int i=1, fizz=0, buzz=0;  i<=n ;i++){
            
            fizz++;
            buzz++;
            
            if(fizz==3 && buzz==5){
                list.add("FizzBuzz");
                fizz=0;
                buzz=0;
            
            }else if(fizz==3){
                list.add("Fizz");
                fizz=0;
            
            }else if(buzz==5){
                list.add("Buzz");
                buzz=0;
            
            }else{
                list.add(String.valueOf(i));
            }
        } 
        return list;
    }
}