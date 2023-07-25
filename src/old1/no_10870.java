package old1;/*
 * 2022.05.04.수
 * 10870번 피보나치 수
 * */
import java.util.Scanner;

public class no_10870 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();  // 숫자 입력
        int sum = fibonacci(num);

        System.out.println(sum);
    }

    static int fibonacci(int num) {
        if (num == 0)	return 0;
        if (num == 1)	return 1;

        int result = fibonacci(num - 1) + fibonacci(num - 2);

        return result;
    }
}

/*
for문으로 풀 수 있는 문제지만, 백준에는 재귀함수로 풀어보라고 되어 있음!
*/