package programmers;

public class divisors_sum {
    public static void main(String[] args) {
        int n = 12;  // answer : 28
        //int n = 5;   // answer : 6

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        //return answer;
        System.out.println(answer);
    }
}
