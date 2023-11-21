package baekjoon.old1;/*
 * 2022.05.19.목
 * 1929번 소수 구하기
 * */
import java.util.Scanner;

public class no_1929 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int M = s.nextInt();
        int N = s.nextInt();
        boolean[] check = new boolean[N+1];
        check[0] = true;
        check[1] = true;

        // M부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
        // (지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
        for(int i = 2; i <= N; i++){
            // 이미 지워진 수라면 건너뛰기
            if(check[i] == true) continue;
            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for(int j = 2*i; j <= N; j+=i)
                check[j] = true;
        }

        // M부터 시작하여 남아있는 수를 모두 출력한다.
        for(int i = M; i <= N; i++){
            if(check[i] == false) System.out.println(i);
        }
    }
}

/*
에라토스테네스의 체
 */