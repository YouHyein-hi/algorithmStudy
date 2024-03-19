package programmers;

import java.util.Scanner;

public class watermelonWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String answer = "";

        for(int i = 0; i < (n/2); i++){
            answer += "수박";
        }
        if(n%2 == 1) answer += "수";

        // 정답 출력
        System.out.println(answer);
    }
}
