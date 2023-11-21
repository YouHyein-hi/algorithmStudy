package baekjoon.old1;/*
 * 2022.04.24.일
 * 2775번 부녀회장이 될테야
 * */
import java.util.Scanner;

public class no_2775 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] apart = new int[15][15];  // 아파트 a층b호

        for(int i = 0; i < 15; i++) {
            apart[i][1] = 1;	// i층 1호
            apart[0][i] = i;	// 0층 i호
        }

        for(int i = 1; i < 15; i ++) {	// ~14층
            for(int j = 2; j < 15; j++) {  // ~14호
                apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
            }
        }

        int testcase = s.nextInt(); // 테스트케이스 입력

        for(int i = 0; i < testcase; i++) {
            int k = s.nextInt();  // 정수 k 입력
            int n = s.nextInt();  // 정수 n 입력
            System.out.println(apart[k][n]);
        }
    }

}