package old1;/*
 * 2022.05.27.금
 * 2798번 블랙잭
 * */
import java.util.Scanner;

public class no_2798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();  // N : 카드의 개수 N
        int M = s.nextInt();  // M : 카드에 쓰여있는 수
        int result = 0;

        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = s.nextInt();  // 카드에 적힌 수
        }


        result = blackJack(card, N, M);

        System.out.println(result);
    }

    public static int blackJack(int[] card, int N, int M) {
        int result = 0, sum = 0;

        // 3장의 카드를 찾는다고 한다.
        for (int i = 0; i < N - 2; i++) {  // 첫번째 카드
            for (int j = i + 1; j < N - 1; j++) {  // 두번째 카드
                for (int k = j + 1; k < N; k++) {  // 세번째 카드
                    sum = card[i] + card[j] + card[k];

                    if (M == sum) return sum;
                    else if ((result < sum) && (sum < M)) result = sum;
                }
            }
        }

        return result;
    }
}
