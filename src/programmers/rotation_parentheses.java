package programmers;

import java.util.*;

public class rotation_parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //String s = "[](){}";

        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for (String str : s.split("")) {
            queue.add(str);
        }

        for(int i = 0; i < queue.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : queue) {
                stringBuilder.append(str);
            }
            String parentheses = stringBuilder.toString();

            answer += function(parentheses);

            String word = queue.poll();
            queue.add(word);

        }


        //return answer;
        System.out.println(answer);
    }

    public static int function(String s) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                if ((currentChar == ')' && stack.pop() != '(') ||
                        (currentChar == ']' && stack.pop() != '[') ||
                        (currentChar == '}' && stack.pop() != '{')) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
