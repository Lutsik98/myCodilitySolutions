package CountingElem;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {

        int[] A = {3,4,4,6,1,4,4};
        solution(5,A);


    }
    public static int[] solution(int N, int[] A) {
        int maxCounters = 0;
        int[] resArray;
        int maxLast = 0;
        resArray = new int[N];
        for(int i = 0; i<A.length; i++){
            if(A[i]<=N){
                resArray[A[i]-1] = Math.max(resArray[A[i]-1],maxLast);
                resArray[A[i]-1]++;
                maxCounters = Math.max(maxCounters,resArray[A[i]-1]);
            }else if(A[i] == N+1){
                maxLast = maxCounters;
            }
        }
        for(int i = 0; i < resArray.length; i++){
            resArray[i] = Math.max(resArray[i], maxLast);
        }
        System.out.println(Arrays.toString(resArray));
        return resArray;
    }


    /*public static int[] solution(int N, int[] A) {
        int maxCounters = 0;
        int[] resArray;
        resArray = new int[N];
        for(int i = 0; i<A.length; i++){
            if(A[i]<=N){
                resArray[A[i]-1]++;
                if(resArray[A[i]-1]>maxCounters){
                    maxCounters = resArray[A[i]-1];
                }
            }else if(A[i] == N+1){
                for(int j = 0; j<N;j++){
                    resArray[j] = maxCounters;
                }
                maxCounters = resArray[0];
            }
        }
        System.out.println(Arrays.toString(resArray));
        return resArray;
    }*/
}
