package TimeCompl;

public class TapeEquilibrum {

    public static void main(String[] args) {

        int[] A = {3,1,2,4,3};
        solution(A);
    }

    /*public static int solution(int[] A){
        int result = 0;
        int size = A.length;

        for(int p=1; p<size ; p++){
            int prev = 0;
            int next = 0;

            for(int i = 0; i < A.length; i++){
                if(i<p){
                    prev = prev+A[i];
                    continue;
                }
                if(i>=p){
                    next = next+A[i];

                }
            }
            int tmp = Math.abs(prev - next);
            if (p == 1) {
                result = tmp;
                continue;

            }else{
                if (result>=tmp){
                    result = tmp;
                    continue;
                }
            }



        }

        System.out.println(result);
        return result;
    }*/
    public static int solution(int[] A){

        int fullSum = 0;
        for (int i = 0; i<A.length; i++){
            fullSum+=A[i];
        }
        int curentDif = Integer.MAX_VALUE;
        int minDif = Integer.MAX_VALUE;

        int sumPrev = 0;
        int sumNext = 0;

        for(int p = 0; p < A.length-1; p++){
            sumPrev += A[p];
            sumNext = fullSum - sumPrev;
            curentDif = Math.abs(sumPrev-sumNext);
            if(curentDif<minDif){
                minDif = curentDif;
            }
        }

        return minDif;
    }


}
