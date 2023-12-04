package programmers;

import java.util.*;

public class english_word_chain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n 입력 받기
        System.out.print("n을 입력하세요 (예: 3) : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // words 배열 입력 받기
        System.out.print("words 배열의 요소를 입력하세요 (예: tank, kick, know, wheel, land, dream, mother, robot, tank) :");
        String input = scanner.nextLine();
        String[] words = input.split(", ");


        // 본격 문제 풀이
        int[] answer = {0, 0};
        ArrayList<String> wordList = new ArrayList<String>();
        String oldWord = null;
        String newWord = null;
        char oldWordLast, newWordFirst;
        boolean state = false;

        // 해시로 풀어볼까?
        // 해시에 각 단어에 n번째 사람이 말했다는 걸 표시하는 거야! (ex. 1, tank)
        // But!! 해시는 중복 key 값을 허용하지 않아서 불가능
        // 그렇다고 n이 아닌 단어를 key로 하기에는 중복된 값이 있을 수 있어서 불가능함
        // 그럼 어떤 걸로?

        // 일단! 탈락자가 생기는 경우 정리
        // 1. 앞사람이 말한 단어의 마지막 문자와 다를 경우
        // 2. 이전에 등장했던 단어일 경우
        // 3. 단어가 한 글자일 경우

        for(int i = 0; i < words.length; i++){
            if(i == 0){
                oldWord = words[i];
                continue;
            }
            state = false;
            newWord = words[i];
            wordList.add(oldWord);
            newWordFirst = newWord.charAt(0);
            oldWordLast = oldWord.charAt(oldWord.length() - 1);

            if (oldWordLast != newWordFirst
                    || newWord.length() == 1 || wordList.contains(newWord)) {
                state = true;
            }

            if (state) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            oldWord = words[i];
        }


        System.out.println("answer 배열: [" + answer[0] + ", " + answer[1] + "]");
    }
}
