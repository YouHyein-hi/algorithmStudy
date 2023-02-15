package old;/*
 * 2022.04.23.토
 * 2446번 별 찍기-9
 * */
import java.util.Scanner;

public class no_2446 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for (int i = 0; i < num; i++) {	// 1 ~ N
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * num - 1) - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < num - 1; i++) {
            for (int j = 1; j < (num - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
