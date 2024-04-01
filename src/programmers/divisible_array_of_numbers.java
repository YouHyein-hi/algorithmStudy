package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divisible_array_of_numbers {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        List<Integer> num = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                num.add(arr[i]);
            }
        }
        if(num.size() == 0) num.add(-1);

        int[] answer = new int[num.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = num.get(i);
        }
        Arrays.sort(answer);

        //return answer;
        System.out.println(Arrays.toString(answer));
    }
}
