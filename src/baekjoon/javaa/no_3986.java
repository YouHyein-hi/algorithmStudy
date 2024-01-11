package baekjoon.javaa;
/*
 * 3986번 실버4 좋은 단어
 * 자료구조,  스택
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int result = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String AB = br.readLine();
            for(int j = 0; j < AB.length(); j++){
                if(!stack.empty() && AB.charAt(j) == stack.peek()){
                    stack.pop();
                }
                else{
                    stack.push(AB.charAt(j));
                }
            }
            if (stack.empty()) result++;
            stack.clear();
        }

        System.out.println(result);
    }
}
