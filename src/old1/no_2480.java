package old1;/*
 * 2022.06.02.목
 * 2480번 주사위 세개
 * '단계별로 풀어보기'에서 도전 중이라 되어있는 단계들 나머지 문제 풀기
 * */
import java.util.Scanner;

public class no_2480 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int reward;

        if (n1 == n2 && n2 == n3 && n1 == n3) reward = 10000 + n1 * 1000;
        else if (n1 == n2 || n1 == n3) reward = 1000 + n1 * 100;
        else if (n2 == n3) reward = 1000 + n2 * 100;
        else reward = Math.max(n1,  Math.max(n2, n3)) * 100;

        System.out.println(reward);
    }
}

/* 맞은줄 알았었는데 틀렸었음 */