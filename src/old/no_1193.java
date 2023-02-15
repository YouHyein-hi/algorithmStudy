package old;/*
 * 2022.05.23.월
 * 1193번 분수찾기
 * */
import java.util.Scanner;

public class no_1193 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int num, N = 0, count = 0, numerator = 1, denominator = 1;

        if(X == 1){
            System.out.println("1/1");
        }
        else{
            while (count < X){
                N++;
                count = N * (N + 1) / 2;
            }
            num = X - (N - 1) * N / 2;

            if(N % 2 ==0 ){
                numerator = num;
                denominator = N - num + 1;
            }
            else {
                numerator = N - num + 1;
                denominator = num;
            }

            System.out.println(numerator + "/" + denominator);
        }
    }
}
