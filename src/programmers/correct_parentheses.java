package programmers;


import java.util.Scanner;
import java.util.Stack;

public class correct_parentheses {
    public static void main(String[] args){
        // 프로그래머스는 입력 받는 부분 안적어도 괜찮음
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열 입력 받기
        System.out.println("괄호를 입력하세요. (예: ()())");
        String s = scanner.nextLine();

        // 정답 풀력하기 위한 변수
        Boolean answer = true;

        // 본격 문제 풀이
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else if(s.charAt(i) == ')'){
                if(!stack.empty()) stack.pop();
                else answer = false;
            }
        }

        if(stack.empty()) answer = true;
        else answer = false;

        // return answer => 이때 프로그래머스는 이렇게 출력하여 답을 확인함
        System.out.println(answer);

    }
}
