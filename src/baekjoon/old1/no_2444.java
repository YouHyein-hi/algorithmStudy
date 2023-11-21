package baekjoon.old1;/*
 * 2022.04.20.수
 * 2444번 별 찍기-7
 * */
import java.util.Scanner;

public class no_2444 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 1; i <= num ; i++) {
            for(int j = 0; j < num-i; j++)  System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)  System.out.print("*");
            System.out.println();
        }

        for(int i = num-1; i >= 0 ; i--) {
            for(int j = 0; j < num-i; j++)  System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)  System.out.print("*");
            System.out.println();
        }
    }
}
