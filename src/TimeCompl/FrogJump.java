package TimeCompl;

public class FrogJump {

    public static void main(String[] args) {
        solution(10,110,20);
    }

    public static int solution(int X, int Y, int D){

        int step = 0;
        while (X<Y){
         X=X+D;
         step++;
         System.out.println(X);
        }

        System.out.println("Step = "+step);
        return step;
    }


}
