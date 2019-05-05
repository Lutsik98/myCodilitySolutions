package CountingElem;

import java.util.HashSet;

public class FrogRiverOne {

    public static void main(String[] args) {

        int[] A = {1,3,1,3,5,3,3};

        solution(5,A);

    }

    public static int solution(int X, int[] A){

        HashSet<Integer> skips= new HashSet<Integer>();
        for (int i = 1; i<= X; i++){
            skips.add(i);
            System.out.println(skips);
        }
        for(int j = 0; j< A.length; j++){
            if(skips.contains(A[j])){
                skips.remove(A[j]);
                if(skips.isEmpty()){
                    return j;
                }
            }
        }
        return -1;
    }

}
