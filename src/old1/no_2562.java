package old1;/*
 * 2022.04.13.수
 * 2562번 최댓값
 * 단계별로 풀어보기 1차원 배열
 * */
import java.util.Scanner;

public class no_2562 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num[] = new int[9];
        int count = 0, n, i;

        for(i = 0; i < num.length; i++) num[i] = s.nextInt();
        n = num[0];
        for(i = 0; i < num.length; i++){
            if(num[i] > n){
                n = num[i];
                count = i;
            }
        }
        count += 1;
        System.out.println(n);
        System.out.print(count);
    }
}
