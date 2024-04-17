package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class find_prime_numbers {
    public static HashSet<Integer> numSet;

    public static void main(String[] args) {
        String numbers = "17"; // answer : 3
        // "011";   answer : 2
        // "232";   answer : 4

        int answer = 0;

        numSet = new HashSet<>();
        permutation("", numbers);
        System.out.println(numSet.toString());

        for (int num : numSet) {
            if (primeNumbers(num))
                answer++;
        }

        //return answer;
        System.out.println(answer);
    }

    public static void permutation(String prefix, String str){ // 순열
        int n = str.length();
        if(!prefix.equals("")){
            numSet.add(Integer.valueOf(prefix));
        }
        for(int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i)
                    + str.substring(i + 1, n));
    }


    public static boolean primeNumbers(int num) { // 소수 찾기
        if(num == 1 || num == 0) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
