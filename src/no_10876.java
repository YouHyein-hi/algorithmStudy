/*
 * 2022.05.03.화
 * 1152번 단어의 개수
 * */
import java.util.Scanner;

public class no_10876 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();  // 숫자 입력
        int sum = factorial(num);

        System.out.println(sum);
    }

    public static int factorial(int num) {
        if(num <= 1) return 1;

        int result = num * factorial(num - 1);

        return result;
    }
}

/*
for문으로 풀 수 있는 문제지만, 백준에는 재귀함수로 풀어보라고 되어 있음!
*/