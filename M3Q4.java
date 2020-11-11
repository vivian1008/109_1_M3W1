import java.util.Scanner;

public class M3Q4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean flag = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}