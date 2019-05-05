package CountingElem;

import java.util.HashSet;

public class MissingInt {

    public static void main(String[] args) {
        int[] A = {1,3,6,4,1,2};
        int[] B = {-1,-3,-2};
        int[] C = {1,2,3,4};
        solution(C);
    }

    public static int solution(int[] A){
        int missInt;
        Object[] resArray;
        HashSet<Integer> mySet = new HashSet<Integer>();
        for(int i=1; i<=A.length; i++){
            mySet.add(i);
        }

        for(int j = 0; j < A.length; j++){
            if(A[j]>0){
                if(mySet.contains(A[j])){
                    mySet.remove(A[j]);
                }
            }
            if(mySet.isEmpty()){
                System.out.println(j+2);
                return j+1;
            }
        }

        resArray = mySet.toArray();
        missInt = (Integer)resArray[0];
        System.out.println(resArray[0]);
        return  missInt;
    }

}
