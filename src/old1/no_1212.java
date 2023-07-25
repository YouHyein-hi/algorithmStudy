package old1;/*
 * 2022.06.06.월
 * 1212번 8진수2진수
 * */
import java.util.Scanner;

public class no_1212 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String num8 = s.next();
        int len= num8.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num8.length(); i++) {
            String a = Integer.toBinaryString(num8.charAt(i)-'0');

            if(a.length()==2 && i!=0)
                a="0"+a;
            else if(a.length()==1 && i!=0)
                a="00"+a;

            sb.append(a);
        }
        System.out.println(sb);
    }
}
