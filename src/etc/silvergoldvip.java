package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class silvergoldvip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] m = new String[N];

        int[] pe = {8, 23, 24};
        int[][] pa = {{50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
                {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
                {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
                {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}};
        int[] es = {100000, 100000, 100000};

        int becomingVIP = 0; // 다음 달에 VIP가 되는 고객 수
        int losingVIP = 0; // 다음 달에 VIP가 아니게 되는 고객 수

        // 모든 고객에 대해 반복
        for (int i = 0; i < pe.length; i++) {
            // 현재와 다음 달의 멤버십 등급을 결정
            String currentGrade = determineMembershipGrade(pe[i], sumPayments(pa[i]));
            String nextGrade = determineMembershipGrade(pe[i] + 1, sumPayments(pa[i]) - pa[i][0] + es[i]);

            // 이번 달에는 VIP가 아니었지만, 다음 달에 VIP가 되는 경우
            if (!currentGrade.equals("VIP") && nextGrade.equals("VIP")) {
                becomingVIP++;
            }
            // 이번 달에는 VIP였지만, 다음 달에 VIP가 아니게 되는 경우
            else if (currentGrade.equals("VIP") && !nextGrade.equals("VIP")) {
                losingVIP++;
            }
        }

        // 변화하는 VIP 고객 수를 담을 answer 배열 선언 및 초기화
        int[] answer = new int[]{becomingVIP, losingVIP};

        System.out.println(answer);
    }

    // 납부 금액의 총합을 계산하는 메서드
    private static int sumPayments(int[] payments) {
        int sum = 0; // 총합을 저장할 변수 초기화
        for (int payment : payments) { // 모든 납부 금액에 대해 반복
            sum += payment; // 총합에 더하기
        }
        return sum; // 총합 반환
    }

    // 멤버십 등급을 결정하는 메서드
    private static String determineMembershipGrade(int period, int totalPayment) {
        // 가입 기간과 납부 금액에 따라 멤버십 등급 결정
        if (period >= 60) { // 5년 이상
            if (totalPayment >= 600000) return "VIP";
            else if (totalPayment >= 480000) return "GOLD";
            else return "SILVER";
        } else if (period >= 24) { // 2년 이상 ~ 5년 미만
            if (totalPayment >= 900000) return "VIP";
            else if (totalPayment >= 600000) return "GOLD";
            else return "SILVER";
        } else { // 2년 미만
            if (totalPayment >= 900000) return "GOLD";
            else return "SILVER";
        }
    }
}