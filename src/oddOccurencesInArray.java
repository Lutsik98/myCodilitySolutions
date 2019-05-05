import java.util.Arrays;

public class oddOccurencesInArray {

    public static void main(String[] args) {

        int[] A = {1,3,1,3,5,3,3};

        solution(A);


    }
//-------------------------------------------------100%------------------------------------------------------
    public static int solution(int[] A) {
        int size = A.length;
        int n=0;
        Arrays.sort(A);

        for( int i = 0; i<size; i=i+2){
            if(i==size-1){
                n=A[i];
                break;
            }
            if(A[i]==A[i+1]){
                continue;
            }
            n=A[i];
            break;
        }

        System.out.println("A = " + Arrays.toString(A));
        System.out.println("A[i] = " + n);
        return n;

    }

    /*public static int[] sort(int[] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length-1; j++){
                if(A[j]>A[j+1]){
                    int tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1]=tmp;
                }
            }
        }return A;
    }*/
//------------------------------------------------------------------------------------------------------------

   /* public static int solution(int[] array) {

        HashMap<Integer, Integer> occurances = new HashMap<>();

        for (int e : array) {
            if (occurances.containsKey(e)) {
                occurances.remove(e);
            } else {
                occurances.put(e, 1);
            }
        }

        List<Integer> oddList = new ArrayList<Integer>(occurances.keySet());
        return oddList.get(0);
    }*/
}
