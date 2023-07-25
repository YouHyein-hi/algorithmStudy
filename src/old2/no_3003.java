package old2;/*
 * 2023.02.16.목
 * 3003번 킹, 퀸, 룩, 비숍, 나이트, 폰
 *
 * 1일 1알고리즘 JAVA 다시 시작!
 * 손풀기로 쉬운 문제들을 풀어보자 (단계별로 풀어보기 - 입출력과 사칙연산)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class no_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chessnum = {1, 1, 2, 2, 2, 8};
        String[] dongnum = br.readLine().split(" ");

        for (int i = 0; i < chessnum.length; i++){
            int dong = Integer.parseInt(dongnum[i]);
            System.out.print(chessnum[i] - dong + " ");
        }

    }
}
