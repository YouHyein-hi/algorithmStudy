package programmers;

import java.util.Scanner;

public class representation_of_numbers {
    public static void main(String[] args) {
        int n = 15;  // answer : 4

        int answer = 0;

        for(int j = 1; j < n; j++){
            int add = 0;

            for(int i = j; i < n; i++){
                add += i;
                if(add > n) break;
                else if (add == n){
                    answer++;
                    break;
                }
            }

        }

        answer++;

        //return answer;
        System.out.println(answer);
    }
}
