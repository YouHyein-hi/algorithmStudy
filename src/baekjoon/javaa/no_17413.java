package baekjoon.javaa;
/*
 * 17413번 실버3 단어 뒤집기2
 * 구현, 자료구조, 문자열, 스택
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_17413 {
    public static String result = "";
    public static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean parenthesis = false;

        String sentence = br.readLine();
        for(int i = 0; i < sentence.length(); i++){
            char word = sentence.charAt(i);
            if(word == '<'){
                parenthesis = true;
            }

            if(parenthesis){
                while(!stack.empty()){
                    result += stack.pop();
                }
                result += word;
                if(word == '>') { parenthesis = false; }
            }
            else{
                if(word == ' '){
                    while(!stack.empty()){
                        result += stack.pop();
                    }
                    result += " ";
                    stack.clear();
                }
                else { stack.push(word); }
            }

            if(i == sentence.length()-1){
                while(!stack.empty()){
                    result += stack.pop();
                }
            }
        }

        System.out.println(result);
    }
}
