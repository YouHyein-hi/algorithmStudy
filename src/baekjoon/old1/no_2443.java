package baekjoon.old1;/*
 * 2022.04.16.토
 * 2443번 별 찍기-6
 * */
import java.util.Scanner;

public class no_2443 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 1 ; i <= num; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = (2*num)-(i*2-1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
