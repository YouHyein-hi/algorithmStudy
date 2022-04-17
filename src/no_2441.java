/*
 * 2022.04.16.토
 * 2441번 별 찍기-4
 * */
import java.util.Scanner;

public class no_2441 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = num-i; j < num; j++) {
                System.out.print(" ");
            }
            for(int k = i; k < num; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
