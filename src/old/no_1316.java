package old;/*
 * 2022.05.15.일
 * 1316번 그룹 단어 체커
 * */
import java.util.Scanner;

public class no_1316 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.next());
        int count = N;

        for (int i = 0; i < N; i++) {
            String word = s.next();
            boolean[] check = new boolean[26];

            for (int j = 0; j < word.length(); j++) {
                if (check[word.charAt(j) - 'a'] == false) {
                    check[word.charAt(j) - 'a'] = true;
                } else if (j > 0 && word.charAt(j) != word.charAt(j - 1)) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
