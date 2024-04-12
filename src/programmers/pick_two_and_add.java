package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pick_two_and_add {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1}; // {5,0,2,7}; {0, 0, 0, 4, 3, 2, 1, 1}; {0, 100, 1000, 10};

        List<Integer> answerList = new ArrayList<>();
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            if(i > 0 && numbers[i] == numbers[i - 1]) continue;
            for(int j = i+1; j < numbers.length; j++){
                answerList.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        answer = Arrays.stream(answer).distinct().toArray();
        Arrays.sort(answer);

        //return answer;
        System.out.println(Arrays.toString(answer));
    }
}
