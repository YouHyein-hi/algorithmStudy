package old1;/*
* 2022.04.13.수
* 10818번 최소, 최대
* 단계별로 풀어보기 1차원 배열
* */
import java.util.Scanner;
import java.util.Arrays;

public class no_10818 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < num.length; i++) num[i] = s.nextInt();
        Arrays.sort(num);

        System.out.print(num[0] + " " + num[n-1]);
    }
}
