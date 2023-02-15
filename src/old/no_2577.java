package old;/*
 * 2022.04.13.수
 * 2577번 숫자의 개수
 * 단계별로 풀어보기 1차원 배열
 * */
import java.util.Scanner;

public class no_2577 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, c, mul;
        int num[] = new int[10];

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        mul = a * b * c;

        while(mul > 0){
            num[mul % 10]++;
            mul /= 10;
        }

        for(int i =  0; i < num.length; i++) System.out.println(num[i]);
    }
}
