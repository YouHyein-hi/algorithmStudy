package old1;/*
 * 2022.06.02.목
 * 15596번 정수 N개의 합
 * '단계별로 풀어보기'에서 도전 중이라 되어있는 단계들 나머지 문제 풀기
 * */

public class no_15596 {
    class Test {
        long sum(int[] a) {
            long sum = 0;

            for(int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum;
        }
    }
}

/* 함수만 구현! */