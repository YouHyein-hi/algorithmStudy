package programmers;

import java.util.Scanner;

public class even_and_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String answer = "Even";

        if(num % 2 == 1){
            answer = "Odd";
        }
        if(num % 2 == -1){
            answer = "Odd";
        }

        System.out.println(answer);
    }
}
