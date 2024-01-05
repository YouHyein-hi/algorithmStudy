package baekjoon.javaa;
/* 2024.01.05.(금)
 * 10773번 실버4 제로
 * 구현, 자료구조, 스택
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_10773 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int input, result = 0;

        for(int i = 0; i < N; i++){
            input = Integer.parseInt(br.readLine());
            if(input == 0){
                stack.pop();
            }
            else{
                stack.push(input);
            }
        }

        if(stack.empty()) result = 0;
        else {
            int size = stack.size();
            for(int i = 0; i < size; i++){
                result += stack.peek();
                stack.pop();
            }
        }

        System.out.println(result);

    }
}
