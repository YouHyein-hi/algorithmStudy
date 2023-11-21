package baekjoon.old1;/*
 * 2022.04.15.금
 * 2438번 별 찍기-1
 * */
import java.util.Scanner;

public class no_2438 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = -1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
