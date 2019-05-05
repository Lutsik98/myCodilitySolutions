package Sorting;

import java.util.Arrays;

public class MaxProdOfThree {

    public static void main(String[] args) {

        int[] A = {-3, 1, 2, -2, 5, 6};
        solution(A);

    }

    public static int solution(int[] A) {
        int result1 = 0;
        int result2 = 0;

        Arrays.sort(A);
        result1 = A[A.length-1]*A[A.length-2]*A[A.length-3];
        result2 = A[0]*A[1]*A[A.length-1];
        if(result1>result2){
            System.out.println(result1);
            return result1;
        }else {
            System.out.println(result2);
            return result2;
        }

    }

}
