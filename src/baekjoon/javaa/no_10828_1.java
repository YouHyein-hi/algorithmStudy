package baekjoon.javaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

public class no_10828_1 {

    public static int[] stack = new int[10001];
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = "";

        for(int i = 0; i < N; i++){
            input = br.readLine();

            if(input.equals("pop")){
                System.out.println(pop());
            }
            else if(input.equals("size")){
                System.out.println(size());
            }
            else if(input.equals("empty")){
                System.out.println(empty());
            }
            else if(input.equals("top")){
                System.out.println(top());
            }
            else {
                String[] pushX = input.split(" ");
                push(Integer.parseInt(pushX[1]));
            }

        }

    }

    public static void push(int num) {
        stack[size] = num;
        size++;
    }
    public static int pop() {
        if(size == 0) return -1;
        else{
            int popNum = stack[size-1];
            stack[size-1] = 0;
            size--;
            return popNum;
        }
    }
    public static int size() {
        return size;
    }
    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }
    public static int top() {
        if(size == 0) return -1;
        else return stack[size-1];
    }
}