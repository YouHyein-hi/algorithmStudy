package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class place_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str){
            answer += a;
        }

        //return answer;
        System.out.println(answer);

    }
}
