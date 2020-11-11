import java.util.Scanner;

public class M3Q2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Double v1 = scn.nextDouble();
        int v2 = scn.nextInt();
        //String str = "%."+v2+"f\n";
        //System.out.print(str,v1);
        System.out.println(Math.round(v1*Math.pow(10,v2))/Math.pow(10,v2));
    }
    }
