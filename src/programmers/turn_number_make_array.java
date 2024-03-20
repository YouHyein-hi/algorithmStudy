package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class turn_number_make_array {
    public static void main(String[] args) {
        long n = 12345;
        String input =  String.valueOf(n);
        String[] array = input.split("");
        int[] answer = new int[array.length];
        int size = array.length;

        for(int i = 0; i < array.length; i++){
            size -= 1;
            answer[size] = Integer.parseInt(array[i]);
        }

        // 정답 출력
        System.out.println(Arrays.toString(answer));
    }
}
