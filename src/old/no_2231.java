package old;/*
 * 2022.05.28.토
 * 2231번 분해합
 * */
import java.util.Scanner;

public class no_2231 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int result = 0;

        for(int i = 1; i < N; i++){
            int num = i;
            int sum = 0;

            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            if(N == (sum + i)){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
