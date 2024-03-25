package programmers;

import java.util.Scanner;

public class middle_characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String answer = "";
        String[] word = s.split("");
        int evenOdd = word.length % 2;  // 0일 경우 짝수, 1일 경우 홀수
        int among = word.length / 2;

        if(evenOdd == 0){  // 짝수
            answer = word[among-1] + word[among];
        }
        else if (evenOdd == 1){  // 홀수
            answer = word[among];
        }

        //return answer;
        System.out.println(answer);
    }
}
