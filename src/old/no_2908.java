package old;/*
 * 2022.05.12.목
 * 2908번 상수
 * */
import java.util.Scanner;

public class no_2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String num = s.nextLine(); // 예제 입력

        StringBuffer sb = new StringBuffer(num);
        String back = sb.reverse().toString(); // 입력한 문자열 거꾸로 변환

        String[] divback = back.split("\\s+"); // 문자열 공백 기준으로 나누기
        int[] numback = new int[2];

        for(int i = 0; i < divback.length; i++){
            numback[i] = Integer.parseInt(divback[i]); // 문자열 정수로 변환
        }

        System.out.println(numback[0] > numback[1] ? divback[0] : divback[1]); // 비교 후 출력
    }
}

/*
너무 복잡하고 긴거같음! 더 간단하게 해보자
 */