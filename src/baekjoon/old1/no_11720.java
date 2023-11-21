package baekjoon.old1;/*
 * 2022.04.22.금
 * 11720번 숫자의 합
 * */
import java.util.Scanner;

public class no_11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = 0;
        int num = s.nextInt();
        String a = s.next();

        for(int i = 0; i < num; i++) {
            result += a.charAt(i) - '0';
        }
        
        System.out.print(result);
    }
}
