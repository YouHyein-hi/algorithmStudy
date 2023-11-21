package programmers;

import java.util.*;

public class dont_like_sameNumber {
    public static void main(String[] args){
        // 프로그래머스는 입력 받는 부분 안적어도 괜찮음
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열 입력 받기
        System.out.println("숫자 배열을 입력하세요. (예: 1,1,3,3,0,1,1)");
        String input = scanner.nextLine();

        // 쉼표를 기준으로 문자열 분할 후 정수 배열로 변환
        String[] numsAsString = input.split(",");
        int[] arr = Arrays.stream(numsAsString)
                .mapToInt(Integer::parseInt)
                .toArray();

        // 본격 문제 풀이
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(i == 0) arrList.add(arr[i]);
            else if (arr[i-1] != arr[i]) arrList.add(arr[i]);
        }

        int[] answer = new int[arrList.size()];

        for(int j = 0; j < answer.length; j++){
            answer[j] = arrList.get(j);
        }
        // return answer => 이때 프로그래머스는 이렇게 출력하여 답을 확인함

        System.out.println("Answer 배열: " + Arrays.toString(answer));

    }
}
