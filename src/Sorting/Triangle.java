package Sorting;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {

        int[] A = {10, 2, 5, 1, 8, 20};
        int[] B = {50, 1, 5};
        solution(B);

    }


    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                if (A[i + 1] + A[i + 2] > A[i]) {
                    if (A[i + 2] + A[i] > A[i + 1]) {
                        System.out.println(1);
                        return 1;
                    }
                }
            }
        }
        System.out.println(0);
        return 0;


    }
}
