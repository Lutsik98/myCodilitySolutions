package Sorting;

import java.util.HashSet;

public class Distinct {
    public static void main(String[] args) {
        int[] A = {0,1,3,2,1,1};
        int[] B = {-1,-3,-3};
        solution(B);

    }


    public static int solution(int[] A) {
        int distValues = 0;

        HashSet<Integer> mySet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (mySet.contains(A[i])) {
                continue;
            } else {
                distValues++;
                mySet.add(A[i]);
            }

        }
        System.out.println(distValues);
        return distValues;
    }
}
