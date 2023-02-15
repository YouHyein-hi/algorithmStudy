package old;/*
 * 2022.04.14.목
 * 8958번 OX퀴즈
 * 단계별로 풀어보기 1차원 배열
 * */
import java.util.Scanner;

public class no_8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        String ox[] = new String[num];

        for (int i = 0; i < ox.length; i++) ox[i] = s.next();

        for (int i = 0; i < ox.length; i++) {
            int cnt = 0, sum = 0; // 반복할 때마다 0으로 초기화
            for (int j = 0; j < ox[i].length(); j++) {
                if (ox[i].charAt(j) == 'O')
                    cnt++;
                else cnt = 0;
                    sum += cnt;
                }
            System.out.println(sum);
        }
    }
}
