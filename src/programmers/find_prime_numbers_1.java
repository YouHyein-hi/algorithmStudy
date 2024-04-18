package programmers;

import java.util.HashSet;

public class find_prime_numbers_1 {
    public static void main(String[] args) {
        int n = 10; // answer : 4
        //int n = 5;  answer : 3

        int answer = 0;

        int[] prime = new int[n + 1];
        prime[0] = prime[1] = 0;

        for(int i = 2; i <=n; i++) prime[i] = i;

        for(int i = 2; i < n;i++){
            if(prime[i] == 0) continue;
            //소수가 아니라면 continue

            for(int j = 2*i; j <= n; j += i) prime[j] = 0;
            //소수의 배수는 소수를 약수로 가지므로 제외
        }

        //소수 개수 구하기
        for (int j : prime) {
            if (j != 0) answer++;
        }

        //return answer;
        System.out.println(answer);
    }
}
