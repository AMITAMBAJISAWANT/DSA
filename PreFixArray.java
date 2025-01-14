import java.util.HashSet;

public class PreFixArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int C[]=new int[A.length];
        int count=0;
        
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                if(!set.contains(A[i]))
                set.add(A[i]);
                count++;
            }
            else{
                if(set.contains(A[i])){
                    count++;
                }
                else{
                    set.add(A[i]);
                }
                if(set.contains(B[i])){
                    count++;
                }
                else{
                    set.add(B[i]);
                }
            }
            C[i]=count;
            
            
        }
        return C;
    }

    
}

    