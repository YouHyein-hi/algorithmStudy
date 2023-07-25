package old2;/*
 * 2023.02.15.수
 * 1000번 A + B
 *
 * 1일 1알고리즘 JAVA 다시 시작!
 * 손풀기로 쉬운 문제들을 풀어보자 (단계별로 풀어보기 - 입출력과 사칙연산)
 * */
import java.io.*;

public class no_1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        System.out.println(num1 + num2);
    }
}
