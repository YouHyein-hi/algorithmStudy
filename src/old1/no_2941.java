package old1;/*
 * 2022.06.02.목
 * 2941번 크로아티아 알파벳
 * */
import java.util.Scanner;

public class no_2941 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};  // croatia[] : 변환해야할 크로아티아 문자들
        String input = s.nextLine();  // input : 표에 나와있는 알파벳은 변경된 형태로 입력

        for(int i = 0; i < croatia.length; i++){
            if(input.contains(croatia[i]))  // input 안에 coratia 배열 안에 있는 값과 동일한게 있는지 확인
                input = input.replace(croatia[i], "a");  // 있다면 문자열로 인식해야되기 때문에 "a"로 변환
        }

        System.out.println(input.length());
    }
}
