package TimeCompl;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {

        int[] A = {};
        solution(A);


    }
    public static int solution(int[] A){
        Arrays.sort(A);
        System.out.println("A = " + Arrays.toString(A));
        int find=0;
        if(A.length==0){
            find=1;
            System.out.println("find = "+find);
            return find;
        }
        for(int i = 0; i<A.length; i++){
            if(A[i]==i+1){
                if(i!=A.length-1){
                    continue;
                }
                find = i+2;
                break;
            }
            if(i==0){
                find = 1;
                break;
            }
            find = i+1;
            break;
        }
        System.out.println("find = "+find);
        return find;

    }

}
