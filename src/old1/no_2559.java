package old1;/*
 * 2022.05.26.목
 * 2559번 수열
 * */
import java.util.Scanner;

public class no_2559 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int N = s.nextInt();  // N : 온도를 측정한 전체 날짜의 수
            int K = s.nextInt();  // K : 합을 구하기 위한 연속적인 날짜의 수
            int[] temp = new int[N];  // temp : 매일 측정한 온도를 나타내는 N개의 정수
            int result = Integer.MIN_VALUE;  // Integer.MIN_VALUE : 정수의 최소값

            for(int i = 0; i < N; i++){
                temp[i] = s.nextInt();  // N일 만큼 측정한 온도 입력
            }
            for(int i = 0; i <= N-K; i++){
                int sum = 0;
                for(int j = i; j < i + K; j++)
                    sum += temp[j];
                result = Math.max(result, sum);  // Math.max : 두 값 중 더 큰 수를 리턴함
            }
            System.out.println(result);
        }
}
