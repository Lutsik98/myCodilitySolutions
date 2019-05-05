import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N:  ");
        int N = in.nextInt();
        String tmp1 = Integer.toBinaryString(N);
        String var = Integer.toBinaryString(N);
        char arr [] = var.toCharArray();




        System.out.println("Number: "+ tmp1);
        int gaps=0;
        int gapsMax=0;


        for(int i=0; i < var.length()-1 ;i++){
            if(arr[i]=='1'&& arr[i+1]=='0'&& i !=var.length()-1) {
                gaps++;

                continue;
            }
            if(arr[i]=='0'&& arr[i+1]=='0'){
                gaps++;
                continue;
            }
            if(arr[i]=='0'&& arr[i+1]=='1'){
                if(gapsMax<=gaps){
                    gapsMax=gaps;
                    gaps=0;
                }
                continue;
            }


        }
        if (gapsMax==0){
            System.out.println("No gaps");
        }else {
            System.out.println(gapsMax);
        }

    }




}
