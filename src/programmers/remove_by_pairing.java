package programmers;

import java.util.Scanner;
import java.util.Stack;

public class remove_by_pairing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == word){
                stack.pop();
            }
            else{
                stack.push(word);
            }
        }

        // return stack.isEmpty() ? 1 : 0;
        System.out.println(stack.isEmpty() ? 1 : 0);
    }
}
