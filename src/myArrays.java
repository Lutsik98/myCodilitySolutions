import java.util.Arrays;

public class myArrays {
    public static void main(String[] args) {

        int[] A = {33,8,9,7,6};

        solution(A, 5 );


    }

    public static int[] solution(int[] A, int K) {
        System.out.println("A = " + Arrays.toString(A));
        int size = A.length-1;

        if(size <= 0){
            return A;
        }


        for (int tmp=1; tmp<=K; tmp++){
            int last = A[size];
            for (int i = 0; i < size; i++) {
                A[size-i] = A[size-(i+1)];

            }
            A[0]=last;
            System.out.println("Arr = " + Arrays.toString(A));

        }
        return A;
    }


}
