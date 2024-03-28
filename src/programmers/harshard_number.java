package programmers;

import java.util.Scanner;

public class harshard_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean answer = true;
        int sum = 0;

        String xString = Integer.toString(x);
        int[] num = new int[xString.length()];

        for (int i = 0; i < xString.length(); i++) {
            num[i] = Integer.parseInt(xString.substring(i, i + 1));
        }

        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }

        if(x % sum != 0) answer = false;

        //return answer;
        System.out.println(answer);
    }
}
