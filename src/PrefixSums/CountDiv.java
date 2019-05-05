package PrefixSums;

public class CountDiv {
    public static void main(String[] args) {

        solution(5,10,2);

    }

    public static int solution(int A, int B, int K){
        int countDiv = 0;
        for (int i = A; i<=B; i++){
            if(i%K==0){
                countDiv++;
            }
        }

        return countDiv;
    }
}
