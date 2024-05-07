package programmers;

public class representation_of_numbers2 {
    // 숫자의 표현 다른 풀이
    // 수학적 방법 사용
    public static void main(String[] args) {
        int n = 15;  // answer : 4

        int answer = 0;
        int num = n;

        for(int i = 1; n > 0; i++){
            if(num <= 0) break;
            if(num % i == 0) answer++;
            num -= i;
        }

        //return answer;
        System.out.println(answer);
    }
}

/*** 수학적 방법?
 * 15 % 1 === 0 // 15                                        O
 * (15-1) % 2 === 0 // 7+8(7+1)                              O
 * (15-(1+2)) % 3 === 0 // 4 + 5(4+1) + 6(4+2)               O
 * (15-(1+2+3)) %4 !==0 //                                   X
 * (15-(1+2+3+4)) % 5 ===0 // 1+2(1+1)+3(1+2)+4(1+3)+5(1+4)  O
 ***/