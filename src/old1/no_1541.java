package old1;/*
 * 2022.05.18.수
 * 1541번 괄호
 * */
import java.util.Scanner;

public class no_1541 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        String numop = s.nextLine();
        String[] strsub = numop.split("\\-");

        for(int i = 0; i < strsub.length; i++){
            String[] stradd = strsub[i].split("\\+");

            for(int j = 0; j < stradd.length; j++){
                if(i == 0) result += Integer.parseInt(stradd[j]);
                else result -= Integer.parseInt(stradd[j]);
            }
        }

        System.out.println(result);
    }
}
