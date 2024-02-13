package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class deommaaiiln {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] m = new String[N];

        for(int i = 0; i < N; i++){
            m[i] = br.readLine();
        }
        int answer = 0; // 유효한 이메일 주소의 개수를 저장할 변수

        // 주어진 이메일 주소 배열을 반복하여 각 이메일 주소를 검증
        for (int i = 0; i < m.length; i++) {
            // isValidEmail 메서드를 호출하여 이메일 주소가 유효한지 확인하고,
            // 유효한 경우에만 answer 값을 증가시킴
            if (isValidEmail(m[i]))
                answer++;
        }

        System.out.println(answer);
    }

    // 주어진 이메일 주소가 유효한지 확인하는 메서드
    private static boolean isValidEmail(String email) {
        // '@'를 기준으로 이메일 주소를 분할하여 로컬 파트와 도메인 파트로 나눔
        String[] parts = email.split("@");
        // 이메일 주소가 '@'를 포함하지 않거나 두 개 이상인 경우 유효하지 않음
        if (parts.length != 2)
            return false;

        // 도메인 파트를 '.'을 기준으로 분할하여 도메인 이름과 탑레벨 도메인으로 나눔
        String[] domainParts = parts[1].split("\\.");
        // 도메인 파트가 '.'을 포함하지 않거나 두 개 이상인 경우 유효하지 않음
        if (domainParts.length != 2)
            return false;

        String name = parts[0]; // 로컬 파트
        String domain = domainParts[0]; // 도메인 이름
        String topLevel = domainParts[1]; // 탑레벨 도메인

        // 로컬 파트의 형식이 올바른지 확인하는 메서드 호출
        // 도메인 이름의 형식이 올바른지 확인하는 메서드 호출
        // 탑레벨 도메인이 com, net, org 중 하나인지 확인하는 메서드 호출
        // 모든 조건을 만족해야 유효한 이메일 주소로 판별됨
        return isValidName(name) && isValidDomain(domain) && isValidTopLevelDomain(topLevel);
    }

    // 이름이 영문 소문자와 '.'로만 구성되고 길이가 1 이상인지 확인하는 메서드
    private static boolean isValidName(String name) {
        return name.matches("[a-z.]+") && name.length() >= 1;
    }

    // 도메인이름이 영문 소문자로만 구성되고 길이가 1 이상인지 확인하는 메서드
    private static boolean isValidDomain(String domain) {
        return domain.matches("[a-z]+") && domain.length() >= 1;
    }

    // 탑레벨도메인이 com, net, org 중 하나인지 확인하는 메서드
    private static boolean isValidTopLevelDomain(String topLevel) {
        return topLevel.equals("com") || topLevel.equals("net") || topLevel.equals("org");
    }
}
