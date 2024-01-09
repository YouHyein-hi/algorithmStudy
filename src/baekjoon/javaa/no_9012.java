package baekjoon.javaa;
/*
 * 9012번 실버4 괄호
 * 자료구조, 문자열, 스택
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class no_9012 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            String parentheses = scanner.next();
            System.out.println(funtion(parentheses));
        }

    }

    public static String funtion(String parentheses){
        Stack<Character> stack = new Stack<>();

        for(int j = 0; j < parentheses.length(); j++){
            if(parentheses.charAt(j) == '(') {
                stack.push('(');
            }
            else if (parentheses.charAt(j) == ')' && stack.empty()){
                return "NO";
            }
            else if (parentheses.charAt(j) == ')' && !stack.empty()){
                stack.pop();
            }
        }
        if(stack.empty()) return "YES";
        else return "NO";

    }

}
