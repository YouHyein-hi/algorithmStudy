package old;/*
 * 2022.05.13.금
 * 1978번 소수 찾기
 * */
import java.util.Scanner;

public class no_1978 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int num, count = 0;
        boolean TF;

        for(int i = 0; i < N; i++){
            TF = true;
            num = s.nextInt();

            if(num == 1) continue;

            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num % j == 0){
                    TF = false;
                    break;
                }
            }
            if (TF) count++;
        }

        System.out.println(count);
    }
}

/*
제곱근 사용!
 */