package programmers;

import java.util.*;

public class functional_development {
    public static void main(String[] args){

        // 프로그래머스는 입력 받는 부분 안적어도 괜찮음
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 문자열 입력 받기
        System.out.println("progresses 배열을 입력하세요. (예: 93,30,55)");
        String progressesInput = scanner.nextLine();
        System.out.println("speeds 배열을 입력하세요. (예: 1,30,5)");
        String speedsInput = scanner.nextLine();
        // 쉼표를 기준으로 문자열 분할 후 정수 배열로 변환
        int[] progresses = Arrays.stream(progressesInput.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] speeds = Arrays.stream(speedsInput.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] distributeDate = new int[progresses.length];
        ArrayList<Integer> listAnswer = new ArrayList<Integer>();

        for(int i = 0; i < progresses.length; i++){
            int num = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) num += 1;
            distributeDate[i] = num;
        }

        for(int j = 1; j < distributeDate.length; j++){
            if(distributeDate[j-1] > distributeDate[j])
                distributeDate[j] = distributeDate[j-1];
        }

        int n = 1;
        for(int k = 1; k < distributeDate.length; k++){
            if(distributeDate[k-1] == distributeDate[k]) n++;
            else if(distributeDate[k-1] != distributeDate[k]) {
                listAnswer.add(n);
                n = 1;
            }

            if(k == (distributeDate.length-1)) listAnswer.add(n);
        }

        int[] answer = new int[listAnswer.size()];
        for(int l = 0; l < answer.length; l++){
            answer[l] = listAnswer.get(l);
        }

        System.out.println("Answer 배열: " + Arrays.toString(answer));

    }
}
