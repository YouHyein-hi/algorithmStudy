package baekjoon.javaa;

/*
 * 2217번 로프
 * 실버 4 : 수학, 그리디알고리즘, 정렬
 */

import java.io.*;
import java.util.*;

public class no_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] rope = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        for(int i = 0; i < N; i++){
            max = Math.max(max, rope[i] * (N - i));
        }
        System.out.println(max);

    }
}
