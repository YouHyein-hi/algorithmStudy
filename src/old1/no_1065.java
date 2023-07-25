package old1;/*
 * 2022.05.21.토
 * 1065번 한수
 * */
import java.util.Scanner;

public class no_1065 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        System.out.println(hannumber(N));
    }

    public static int hannumber(int N){
        int count = 0;

        if(N < 100){
            return N;
        }
        else {
            count = 99;

            for(int i = 100; i <= N; i++){
                int num1 = i / 100;  //백의 자릿수
                int num2 = (i / 10) % 10;  // 십의 자릿수
                int num3 = i % 10;  // 일의 자릿수

                if((num1 - num2) == (num2 - num3))
                    count++;
            }
        }

        return count;
    }
}
