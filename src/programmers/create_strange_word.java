package programmers;

import java.util.Scanner;
import java.util.Stack;

public class create_strange_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] word = s.split("");
        int count = 0;


        for(int i = 0; i < word.length; i++){
            if(word[i].equals(" ")){
                count = 0;
                continue;
            }
            if(count == 0 || count % 2 == 0){
                word[i] = word[i].toUpperCase();
            }
            else {
                word[i] = word[i].toLowerCase();
            }
            count++;
        }

        //return String.join("", word);
        System.out.println(String.join("", word));
    }
}
