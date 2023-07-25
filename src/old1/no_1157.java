package old1;/*
 * 2022.04.29.금
 * 1157번 단어 공부
 * */
import java.util.Scanner;

public class no_1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] eng = new int[26]; // 영문자의 개수는 26개
        String word = s.next();  // 단어 입력

        for (int i = 0; i < word.length(); i++){ // 대소문자
            int n;
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                n = word.charAt(i) - 'A';
                eng[n]++;
            }
            else {	// 소문자 범위
                n = word.charAt(i) - 'a';
                eng[n]++;
            }
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (eng[i] > max) {
                max = eng[i];
                result = (char) (i + 65);
            }
            else if (eng[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}

/*
1. 대문자와 소문자 구분 X
2. 주어진 단어에서 가장 많이 사용된 알파벳을 '대문자'로 출력
3. 여러 개일 경우 ?로 출력
 */