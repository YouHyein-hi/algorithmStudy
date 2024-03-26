package programmers;

import java.util.Scanner;

public class add_a_digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = 0;
        String s = String.valueOf(n);
        String[] num = s.split("");

        for(int i = 0; i < num.length; i++){
            answer += Integer.parseInt(num[i]);
        }

        //return answer;
        System.out.println(answer);
    }
}
