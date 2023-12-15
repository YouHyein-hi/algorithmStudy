package baekjoon.javaa;

/*
 * 1789번 수들의 합
 * 실버 5 : 수학, 그리디알고리즘
 */

import java.io.*;

public class no_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum=0;
        int N=1;

        while(true){
            sum += N;
            if(sum > S){
                System.out.println(N);
                break;
            }
            N++;
        }


    }
}
