package programmers;

public class colatz_speculation {
    public static void main(String[] args) {
        int num = 6;   // answer : 8
        //int num = 16;   // answer : 4
        //int num = 626331;   // answer : -1


        int answer = 0;
        int i = 0;

        for (i = 0; i < 500; i++) {
            if (num == 1) {
                answer = i;
                break;
            }

            if(num % 2 == 0){  //짝수
                num = num / 2;
            }
            else if(num % 2 == 1){  //홀수
                num = num * 3 + 1;
            }
        }

        if(i >= 500) answer = -1;

        //return answer;
        System.out.println(answer);
    }
}
