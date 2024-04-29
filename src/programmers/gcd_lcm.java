package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        int n = 3;  // 2;
        int m = 12; // 5;
        // answer = [3, 12]  // answer = [1, 10]

        int[] answer = new int[2];

        // 최대공약수 계산
        int gcd = getGCD(n, m);
        answer[0] = gcd;

        // 최소공배수 계산
        int lcm = n * m / gcd;
        answer[1] = lcm;

        //return answer;
        System.out.println(Arrays.toString(answer));
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
