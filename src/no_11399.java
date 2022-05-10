/*
 * 2022.05.09.월
 * 2839번 설탕배달
 * */
import java.util.Arrays;
import java.util.Scanner;

public class no_11399 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();  // 사람 수 입력
        int[] P = new int[N];

        // 각 사람이 돈을 인출하는데 걸리는 시간 Pi 입력
        for(int i = 0; i < N; i++){
            P[i] = s.nextInt();
        }
        Arrays.sort(P);  // 정렬 (합의 최솟값을 구하기 위해)

        int result = 0, waiting = 0;  // result : 총합, waiting : 대기시간
        for(int i = 0; i < N; i++){
            result += P[i] + waiting; // result = result + P[i] + waiting, 돈을 인출하는데 걸리는 시간 + 누적 대기시간 + 지금까지 합한 총합을 다시 총합에 더한다.
            waiting += P[i];
        }

        System.out.println(result);
    }
}
