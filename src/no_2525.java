/*
 * 2022.04.28.목
 * 2525번 오븐시계
 * 단계별풀기 (입출력과 사칙연산 ~ 1차원 배열) 안 푼 거 다 풀기
 * */
import java.util.Scanner;

public class no_2525 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int hour = s.nextInt();
        int minu = s.nextInt();
        int time = s.nextInt();

        int sum = (hour * 60) + minu + time;
        hour = sum / 60;
        minu = sum % 60;

        if(hour >= 24){
            hour = hour - 24;
        }

        System.out.println(hour + " " + minu);
    }
}
