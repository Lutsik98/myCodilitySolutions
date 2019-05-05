package CountingElem;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {

        int[] A = {1,3,1,3,5,3,3};

        solution(A);


    }

    public static int solution(int[] A){
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++){
            if(A[i] == i+1){
                continue;
            }
            else return 0;
        }

        return 1;
    }

}
