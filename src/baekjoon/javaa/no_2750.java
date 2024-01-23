package baekjoon.javaa;
/*
 * 2750번 브론즈2 수 정렬하기
 * 구현, 정렬
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        int same = 0;
        for(int i = 0; i < num.length; i++){
            if(same != num[i]) System.out.println(num[i]);
            same = num[i];
        }
    }
}
