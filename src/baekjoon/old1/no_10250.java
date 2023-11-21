package baekjoon.old1;/*
 * 2022.05.16.월
 * 10250번 ACM 호텔
 * */
import java.util.Scanner;

public class no_10250 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int T = s.nextInt();

        for(int i = 0; i < T; i++){
            int H = s.nextInt(); // 호텔의 층 수
            int W = s.nextInt(); // 각 층의 방 수
            int N = s.nextInt(); // 몇번째 손님

            if(N % H == 0){
                num = (H * 100) + (N / H);
                System.out.println(num);
            }
            else{
                num = ((N % H) * 100) + ((N / H) + 1);
                System.out.println(num);
            }
        }
    }
}
