package baekjoon.old1;/*
 * 2022.05.24.화
 * 11659번 구간 합 구하기 4
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_11659 {
    static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());  // N, M 입력
        int N = Integer.parseInt(st.nextToken());  // 수의 개수 N
        int M = Integer.parseInt(st.nextToken());  // 헙 구해야하는 횟수 M

        st = new StringTokenizer(br.readLine());   // N개의 숫자 입력
        array = new int[N + 1];
        for(int i = 1; i <= N; i++){
            array[i] = array[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());  // M개의 줄에 합을 구해야하는 구간 i와 j
            int I = Integer.parseInt(st.nextToken()); // i
            int J = Integer.parseInt(st.nextToken()); // j

            System.out.println(array[J]-array[I - 1]); // 주어진 i번째 수 부터 j번째 수 까지의 합 출력
        }
    }
}
