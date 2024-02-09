package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class carpet {
    public static void main(String[] args){
        // 프로그래머스는 입력 받는 부분 안적어도 괜찮음
        Scanner scanner = new Scanner(System.in);

        System.out.print("brown : ");
        int brown = scanner.nextInt();
        System.out.print("yellow : ");
        int yellow = scanner.nextInt();

        // 본격 문제 풀이
        int[] answer = new int[2];
        int plus = brown + yellow;

        // plus의 약수를 구하는 코드
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= plus; i++) {
            if (plus % i == 0) {
                divisorList.add(i);
            }
        }
        // 약수의 사이즈와 중앙 값을 구함
        int divisorSize = divisorList.size();
        int divisorCenter = divisorSize / 2;
        // 약수의 중앙값에 맞춰서 answer 값 구하기
        if(divisorSize % 2 == 0){
            answer[0] = divisorList.get(divisorCenter);
            answer[1] = divisorList.get(divisorCenter-1);
        }
        else {
            answer[0] = divisorList.get(divisorCenter);
            answer[1] = divisorList.get(divisorCenter);
        }

        // brown 조건과 yellow 조건을 만족하는지 확인
        while (true) {
            if ((answer[0] - 2) * (answer[1] - 2) == yellow) {
                break;
            } else {
                divisorCenter--;
                answer[1] = divisorList.get(divisorCenter);
                answer[0] = divisorList.get(divisorSize - divisorCenter - 1);
            }
        }

        System.out.print(Arrays.toString(answer));

    }
}
