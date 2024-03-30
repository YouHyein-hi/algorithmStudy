package programmers;

import java.util.Scanner;

public class covering_phone_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone_number = scanner.nextLine();

        String answer = "";
        String[] num = phone_number.split("");

        for(int i = 0; i < num.length-4; i++){
            num[i] = "*";
        }

        answer = String.join("", num);

        //return answer;
        System.out.println(answer);
    }
}
