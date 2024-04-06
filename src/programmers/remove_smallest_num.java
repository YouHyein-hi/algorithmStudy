package programmers;

import java.util.Arrays;

public class remove_smallest_num {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};   //{10};

        int num = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(num > arr[i]) num = arr[i];
        }

        int[] answer = new int[arr.length-1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                answer[j++] = arr[i];
            }
        }

        if(answer.length == 0) answer = new int[]{-1};

        //return answer;
        System.out.println(Arrays.toString(answer));
    }
}
