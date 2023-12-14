package baekjoon.javaa;

/*
 * 1764번 듣보잡
 * 실버 4 : 자료 구조, 문자열, 정렬, 해시를 사용한 집합과 맵
 */

import java.io.*;
import java.util.*;

public class no_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashSet<String> hear = new HashSet<>();
        List<String> result = new ArrayList<>();

        for(int i = 0; i < N; i++){
            hear.add(br.readLine());
        }

        for(int j = 0; j < M; j++){
            String look = br.readLine();
            if(hear.contains(look)) result.add(look);
        }

        System.out.println(result.size());
        Collections.sort(result);
        for (String s : result) {
            System.out.println(s);
        }

    }

}
