package programmers;

import java.util.*;

public class mock_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // answers 배열 입력 받기
        System.out.print("answers 배열의 요소를 입력하세요 (예: 1, 2, 3, 4, 5) :");
        String input = scanner.nextLine();

        // 쉼표를 기준으로 문자열 분할 후 정수 배열로 변환
        String[] numsAsString = input.split(", ");
        int[] answers = Arrays.stream(numsAsString)
                .mapToInt(Integer::parseInt)
                .toArray();

        // 본격 문제 풀이
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == first[i%5]) score[0]++;
            if(answers[i] == second[i%8]) score[1]++;
            if(answers[i] == third[i%10]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        ArrayList<Integer> answerArray = new ArrayList<Integer>();
        for(int i = 0; i < score.length; i++){
            if(max == score[i]) answerArray.add(i+1);
        }

        int[] answer = new int[answerArray.size()];
        for (int i = 0; i < answerArray.size(); i++) {
            answer[i] = answerArray.get(i);
        }

        System.out.println("Answer 배열: " + Arrays.toString(answer));

    }
}
