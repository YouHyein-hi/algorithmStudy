package baekjoon.javaa;
/*
 * 4949번 실버4 균형잡힌 세상
 * 자료구조, 문자열, 스택
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String sentence = br.readLine();

            // 입력의 종료 조건 : 맨 마지막에 온점 하나(".")가 들어온다.
            if(sentence.equals(".")) break;

            System.out.println(result(sentence));
        }
    }

    public static String result(String sentence){
        Stack<Character> stack = new Stack<>();

        for(int j = 0; j < sentence.length(); j++){
            char word = sentence.charAt(j);

            if(word == '(' || word == '[') {
                stack.push(word);
            }
            else if(word == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if(word == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()) return "yes";
        else return "no";
    }
}
