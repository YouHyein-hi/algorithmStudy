/*
 * 2022.06.01.수
 * 11721번 열 개씩 끊어 출력하기
 * */
import java.util.Scanner;

public class no_11721 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String word = s.next();

        for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}
