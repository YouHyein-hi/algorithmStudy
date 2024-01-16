package programmers;
/*
 * 최소 직사각형
 * Level 1 : 브루트포스 알고리즘(완전탐색)
 */
public class minimum_rectangle {
    public static void main(String[] args) {
        // 프로그래머스는 해당 플랫폼에서 입력해주기 때문에, 예시 입력을 sizes 변수에 넣어놨다.
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };
        int answer = 0;

        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int i0 = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = i0;
            }
        }

        int x = sizes[0][0], y = sizes[0][1];
        for(int i = 0; i < sizes.length; i++){
            x = Math.max(x, sizes[i][0]);
            y = Math.max(y, sizes[i][1]);
        }

        answer = x * y;

        System.out.println(answer);
    }
}
