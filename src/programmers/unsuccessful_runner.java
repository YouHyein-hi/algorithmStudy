package programmers;


import java.util.Arrays;

public class unsuccessful_runner {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        // {"marina", "josipa", "nikola", "vinko", "filipa"};
        // {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"eden", "kiki"};
        // {"josipa", "filipa", "marina", "nikola"};
        // {"stanko", "ana", "mislav"};

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])) answer = participant[i];
            else answer = participant[participant.length-1];
        }

        //return answer;
        System.out.println(answer);
    }
}
