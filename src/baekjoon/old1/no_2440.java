package baekjoon.old1;/*
 * 2022.04.15.금
 * 2440번 별 찍기-3
 * */
import java.util.Scanner;

public class no_2440 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for (int i = 1; i <= num; ++i) {
            for (int j = 1; j <= num - i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
