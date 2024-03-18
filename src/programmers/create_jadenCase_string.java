package programmers;

import java.util.Scanner;

public class create_jadenCase_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        //본격적인 풀이 코드
        boolean first = true;
        String[] word = s.split("");

        for(int i = 0; i < word.length; i++){
            if(word[i].equals(" ")){
                first = true;
                continue;
            }

            if(first){
                word[i] = word[i].toUpperCase();
                first = false;
            }
            else {
                word[i] = word[i].toLowerCase();
            }

        }

        String answer = String.join("", word);

        // 정답 출력
        System.out.println(answer);
    }
}
