/*
 * 2022.04.21.목
 * 2445번 별 찍기-8
 * */
import java.util.Scanner;

public class no_2445 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 1 ; i <= num; i++) {
            for(int j = 0; j < i; j++) System.out.print("*");
            for(int k = 2*num-i; k > 0; k--) {
                if(k>i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2; i <= num; i++) {
            for(int j = i; j <= num; j++) System.out.print("*");
            for(int k = 1; k < i*2-1; k++) System.out.print(" ");
            for(int h = num; h >= i; h--) System.out.print("*");
            System.out.println();
        }
    }
}
