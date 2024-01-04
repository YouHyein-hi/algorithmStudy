package baekjoon.javaa;
/* 2024.01.04.(목)
* 10828번 실버4 스택
* 구현, 자료구조, 스택
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

public class no_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        String input = "";

        for(int i = 0; i < N; i++){
            input = br.readLine();
            if(input.equals("pop")){
                if(stack.empty()) System.out.println("-1");
                else {
                    System.out.println(stack.peek());
                    stack.pop();
                }
            }
            else if(input.equals("size")){
                System.out.println(stack.size());
            }
            else if(input.equals("empty")){
                if(stack.empty()) System.out.println("1");
                else System.out.println("0");
            }
            else if(input.equals("top")) {
                if(stack.empty()) System.out.println("-1");
                else System.out.println(stack.peek());
            }
            else{
                String[] pushX = input.split(" ");
                stack.push(Integer.valueOf(pushX[1]));
            }
        }

    }
}
