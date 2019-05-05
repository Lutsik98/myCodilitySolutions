package Leader;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dominator {
    public static void main(String[] args) {

        int[] A = {3,1,2,1,1,};
        solution(A);

    }

    public static  int solution(int[] A){

        Map<Integer,Integer> numberMap = new HashMap<>();
        for( int i : A){

            Integer count = numberMap.get(i);
            if (count == null){
                numberMap.put(i,1);
            }else {
                numberMap.put(i, count+1);
            }
        }
        int maxLeader = 0;
        int indexLeader = 0;

        Set<Integer> keys = numberMap.keySet();
        for (Integer key : keys){
            int tmp = numberMap.get(key);
            if(tmp > maxLeader){
               // System.out.println(key);
                maxLeader = tmp;
                indexLeader = key;

            }
                            //System.out.println("Number "+key +" bylo " + numberMap.get(key));
            //numberMap.get(key);
        }
        if(maxLeader>(A.length/2)){
            for(int i = 0; i<A.length; i++){
                if(A[i] == indexLeader){
                    System.out.println(i);
                    return i;
                }
            }
            //System.out.println("Leader " +  maxLeader + " indexLeader " + indexLeader );

        }
        System.out.println("no leader");
        return  -1;

    }
}
