import java.util.Scanner;

public class M3Q3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String str_line[] = new String[n];

        for(int i = 0; i < n; i++){
            str_line [i] = scn.nextLine();
        }
        for(int i = 0; i < n; i++){
            String str_one[] = str_line[i].split(" ");
            int num[] = new int[str_one.length];
            for(int k = 0; k < str_one.length; k++){
                switch(str_one[k].charAt(0)){
                    case'S':
                    num[k] = 300 + Integer.parseInt(str_one[k].substring(1));
                    break;
                    case'H':
                    num[k] = 200 + Integer.parseInt(str_one[k].substring(1));
                    break;
                    case'D':
                    num[k] = 100 + Integer.parseInt(str_one[k].substring(1));
                    break;
                    case'C':
                    num[k] = Integer.parseInt(str_one[k].substring(1));
                    break;
                }
            }
            for(int k = 0; k < str_one.length; k++){
                for(int x = k; x < str_one.length; x++){
                    if (num[k] < num[x]){
                        int t = num[k];
                        num[k] = num[x];
                        num[x] = t;
                        String s = str_one[k];
                        str_one[k] = str_one[x];
                        str_one[x] = s;
                    }
                }
            }
            for(int k = 0; k < str_one.length; k++){
                System.out.print(str_one[k]+" ");
            }
            System.out.println();
        }
    }
    }