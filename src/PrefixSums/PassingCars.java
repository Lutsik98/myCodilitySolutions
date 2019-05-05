package PrefixSums;

public class PassingCars {

    public static void main(String[] args) {

        int[] A = {0,1,0,1,1,1};
        solution(A);

    }
    public static int solution(int[] A) {
        int count = 0,sumZeros = 0;

        for(int i = 0; i<A.length; i++) {
            if (A[i] == 0) {
                sumZeros ++;
            }
            if (A[i] == 1 ){
                count+=sumZeros;
            }
            if (count > 100000000){
                return -1;
            }
        }
        System.out.println(count);
        return count;
    }

    /*public static int solution(int[] A) {
        int sum = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] == 0){
                for(int k = i; k<A.length; k++){
                    if(A[k] == 0){
                        continue;
                    }else sum++;
                }
            }
        }
        System.out.println(sum);
        return sum;
    }*/
}
