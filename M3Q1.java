import java.util.Scanner;

public class M3Q1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++){
            int n = scn.nextInt();
            if(n > Max){
                Max = n;
            }
            if(n < Min){
                Min = n;
            }
        }
        System.out.println(Max);
        System.out.println(Min);
    }
}