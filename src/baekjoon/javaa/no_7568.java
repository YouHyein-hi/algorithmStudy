package baekjoon.javaa;
/*
 * 7568번 실버5 덩치
 * 구현, 완전탐색
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 입출력 예시
A  (55, 185)  2
B  (58, 185)  2
C  (88, 186)  1
D  (60, 175)  2
E  (46, 155)  5
 */

public class no_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] people = new int[N][2];

        for(int i = 0; i < N; i++){
            String body = br.readLine();
            String[] bodyAB = body.split(" ");
            people[i][0] = Integer.parseInt(bodyAB[0]);
            people[i][1] = Integer.parseInt(bodyAB[1]);
        }

        for(int i = 0; i < N; i++){
            int rank = 1;
            int p1_weight = people[i][0];
            int p1_height = people[i][1];
            for(int j = 0; j < N; j++){
                if(i == j) continue;
                int p2_weight = people[j][0];
                int p2_height = people[j][1];

                if(p1_weight < p2_weight && p1_height < p2_height) rank++;
            }
            System.out.print(rank + " ");
        }

    }
}
