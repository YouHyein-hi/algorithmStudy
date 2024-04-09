package programmers;

import java.util.Arrays;

public class budget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        int answer = 0;
        int add = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            add += d[i];
            if(add > budget){
                answer = i;
                break;
            }
        }

        if(add <= budget){
            answer = d.length;
        }

        //return answer;
        System.out.println(answer);
    }
}
