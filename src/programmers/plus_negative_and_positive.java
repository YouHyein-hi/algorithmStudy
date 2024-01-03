package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class plus_negative_and_positive {
    public static void main(String[] args){
        // 프로그래머스는 입력 받는 부분 안적어도 괜찮음
        Scanner scanner = new Scanner(System.in);

        System.out.println("absolutes 배열을 입력하세요. (예: 4,7,12)");
        String input_absolutes = scanner.nextLine();
        // 쉼표를 기준으로 문자열 분할 후 정수 배열로 변환
        String[] numsAsString = input_absolutes.split(",");
        int[] absolutes = Arrays.stream(numsAsString)
                .mapToInt(Integer::parseInt)
                .toArray();


        System.out.println("signs 배열을 입력하세요. (예: true,false,true)");
        String input_signs = scanner.nextLine();
        // 쉼표를 기준으로 문자열 분할 후 부울 배열로 변환
        String[] booleansAsString = input_signs.split(",");
        boolean[] signs = new boolean[booleansAsString.length];
        for (int i = 0; i < booleansAsString.length; i++) {
            signs[i] = Boolean.parseBoolean(booleansAsString[i]);
        }

        int answer = 0;


        // 본격 문제 풀이
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == false) absolutes[i] *= -1;
            answer += absolutes[i];
        }


        // return answer => 이때 프로그래머스는 이렇게 출력하여 답을 확인함
        System.out.println(answer);
    }
}
