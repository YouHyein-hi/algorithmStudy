package baekjoon.javaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2023.10.05. 목
 * 2869번 달팽이는 올라가고 싶다
 */
public class no_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ABV = br.readLine().split(" ");
        int A = Integer.parseInt(ABV[0]); //  달팽이가 올라갈 V 미터 나무 막대
        int B = Integer.parseInt(ABV[1]); //  달팽이가 낮에 올라갈 수 있는 A 미터
        int V = Integer.parseInt(ABV[2]); //  달팽이가 밤에 잠을 자는 동안 미끄러지는 B 미터 (정상에 올라간 후에는 미끄러지지 X)

        // 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는가?
    }
}
