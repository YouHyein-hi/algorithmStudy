package baekjoon.javaa;
/*
 * 2798번 블랙잭
 * 브론즈2 : 브루트포스 알고리즘(완전탐색)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numArray = new int[N];
        int result = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < (N-2); i++){
            for(int j = (i+1); j < (N-1); j++){
                for(int k = (j+1); k < N; k++){
                    int add = numArray[i] + numArray[j] + numArray[k];
                    if(add > result && add <= M) result = add;
                }
            }
        }

        System.out.println(result);
    }
}
