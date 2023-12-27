package baekjoon.javaa;

/*
 * 1026번 보물
 * 실버 4 : 수학, 그리디알고리즘, 정렬
 */

import java.io.*;
import java.util.*;


public class no_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        Integer B[] = new Integer[N];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            result += A[i] * B[i];
        }
        System.out.println(result);
    }
}
