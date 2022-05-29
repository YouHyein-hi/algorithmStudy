/*
 * 2022.05.28.토
 * 2231번 분해합
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // N : 전체 사람의 수
        int[][] people = new int[N][2];  // 각 사람의 몸무게와 키

        String[] s;
        for(int i = 0; i < N; i++) {
            s = br.readLine().split(" ");
            people[i][0] = Integer.parseInt(s[0]);  // 몸무게
            people[i][1] = Integer.parseInt(s[1]);  // 키
        }

        for(int i = 0; i < N; i++) {
            int ranking = 1;

            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    ranking++;
                }
            }

            System.out.print(ranking + " ");
        }

    }
}