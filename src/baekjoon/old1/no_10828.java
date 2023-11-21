package baekjoon.old1;/*
 * 2022.05.06.금
 * 10828번 스택
 * */
import java.util.Scanner;

public class no_10828 {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = s.nextInt();
        stack = new int[n];

        for(int i = 0; i < n; i++){
            String command = s.next();

            switch (command){
                case "push":
                    int x = s.nextInt();
                    push(x);
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }

    // 정수 X를 스택에 넣는 연산이다.
    public static void push(int X){
        stack[size] = X;
        size++;
    }

    // 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
    // 만약 스택에 들어있는 정수가 없는 경우, -1를 출력한다.
    public static int pop(){
        if (size == 0)  return -1;
        else{
            int result = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return result;
        }
    }

    // 스택에 들어있는 정수의 개수를 출력한다.
    public static int size(){
        return size;
    }

    // 스택이 비어있으면 1, 아니면 0을 출력한다.
    public static int empty(){
        if(size == 0) return 1;
        else return 0;
    }

    // 스택의 가장 위에 있는 정수를 출력한다.
    // 만약 스택에 들어있는 정수가 없는 경우에는 -1를 출력한다.
    public static int top() {
        if(size == 0) return -1;
        else return stack[size - 1];
    }

}
