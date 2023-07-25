package old1;/*
 * 2022.04.17.일
 * 2442번 별 찍기-5
 * */
import java.util.Scanner;

public class no_2442 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
