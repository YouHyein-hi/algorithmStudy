/*
 * 2022.04.13.수
 * 1546번 평균
 * 단계별로 풀어보기 1차원 배열
 * */
import java.util.Arrays;
import java.util.Scanner;

public class no_1546 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m, n;
        double result = 0;

        n = s.nextInt();

        int num[] = new int[n];
        double div[] = new double[n];

        for(int i = 0; i < num.length; i++) num[i] = s.nextInt();
        Arrays.sort(num);
        m = num[n-1];

        for(int i = 0; i < num.length; i++) div[i] = (double)num[i] / (double)m * 100;
        for(int i = 0; i < num.length; i++) result += div[i];
        result /= n;
        System.out.print(result);
    }
}
