package old;/*
 * 2022.04.28.목
 * 2675번 문자열 반복
 * */
import java.util.Scanner;

public class no_2675 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int testcase = s.nextInt();

        for(int i = 0; i < testcase; i++){
            int R = s.nextInt();
            String S = s.next();
            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
