package programmers;

import java.util.Scanner;

public class divisor_add_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // left:13, right:17, answer:43
        // left:24, right:27, answer:52
        System.out.print("left : ");
        int left = scanner.nextInt();
        System.out.print("right : ");
        int right = scanner.nextInt();

        int answer = 0;

        for(int n = left; n <= right; n++){
            int count = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0) count++;
            }
            if(count % 2 == 1) answer -= n; //홀수
            else answer += n; //짝수
        }

        //return answer;
        System.out.println(answer);
    }
}
