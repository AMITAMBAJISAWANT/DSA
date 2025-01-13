import java.util.HashMap;

public class MinimumLengthString {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        
        int minus=0;
        for(int value:map.values()){
            while(value>=3){
                minus+=2;
                value-=2;
            }
        }
    return s.length()-minus;
    }
    
}


