package programmers;

import java.util.Arrays;

public class adding_a_number_without {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 45;

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < 10; j++){
                if(numbers[i] == j){
                    answer -= numbers[i];
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
