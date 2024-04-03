package programmers;

public class number_of_p_y {
    public static void main(String[] args) {
        String s = "pPoooyY";

        boolean answer = false;
        int numP = 0;
        int numY = 0;
        String[] word = s.split("");

        for(int i = 0; i < word.length; i++){
            if(word[i].equals("p") || word[i].equals("P")) numP++;
            else if(word[i].equals("y") || word[i].equals("Y")) numY++;
        }

        if(numP == numY) answer = true;

        //return answer;
        System.out.println(answer);
    }
}
