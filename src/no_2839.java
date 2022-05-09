/*
 * 2022.05.09.월
 * 2839번 설탕배달
 * */
import java.util.Scanner;

public class no_2839 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bag = 0;
        int N = s.nextInt();

        while (true){
            if((N%5) == 0){
                bag += N / 5;
                System.out.println(bag);
                break;
            }
            else{
                N -= 3;
                bag++;
            }

            // 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
            if(N < 0){
                System.out.println("-1");
                break;
            }
        }
    }
}


/*다른 방법 있을 거 같음 일단 이렇게 하기*/