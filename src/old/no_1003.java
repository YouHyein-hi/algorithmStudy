package old;/*
 * 2022.06.09.목
 * 1003번 피보나치 함수
 * */

import java.util.Scanner;

public class no_1003 {
    static Integer[][] dynamic = new Integer[41][2];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        dynamic[0][0] = 1;
        dynamic[0][1] = 0;
        dynamic[1][0] = 0;
        dynamic[1][1] = 1;

        int T = s.nextInt();

        while(T-- > 0){
            int N = s.nextInt();
            fibonacci(N);
            sb.append(dynamic[N][0] + " " + dynamic[N][1]).append('\n');
        }
        System.out.print(sb);
    }

    static Integer[] fibonacci(int n) {
        if(dynamic[n][0] == null || dynamic[n][1] == null) {
            dynamic[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dynamic[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return dynamic[n];
    }

}
