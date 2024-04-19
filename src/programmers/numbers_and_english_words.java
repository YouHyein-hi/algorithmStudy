package programmers;

public class numbers_and_english_words {
    public static void main(String[] args) {
        String s = "one4seveneight"; // answer : 1478
        // String s = "23four5six7";   answer : 234567
        // String s = "2three45sixseven";   answer : 234567
        // String s = "123";   answer : 123

        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++){
            s = s.replace(numbers[i], Integer.toString(i));
            // replace([기존문자],[바꿀문자])
        }

        answer = Integer.parseInt(s);

        //return answer;
        System.out.println(answer);
    }
}
