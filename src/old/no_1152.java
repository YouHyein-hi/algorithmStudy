package old;/*
 * 2022.05.02.월
 * 1152번 단어의 개수
 * */
import java.util.Scanner;

public class no_1152 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String sentence = s.nextLine();
        sentence = sentence.trim();  // trim(): 문자열에 존재하는 공백을 제거해줌, 앞 뒤 쪽에만 있는 공백만 제거! 가운데 공백은 X
        String word[] = sentence.split(" ");  // split(): 지정된 문자로 대상 문자열을 나누어 배열로 반환!

        if(sentence.isEmpty())  // isEmpty(): 문자열 길이가 0인 경우, true를 리턴해줌!
            System.out.println(0);
        else
            System.out.println(word.length);
    }
}

/*
15번 줄 isEmpty()말고도 다른거 많은 걸로 안다. 나중에 찾아보기!
 */