package old1;/*
 * 2022.04.27.수
 * 10809번 알파벳 찾기
 * */
import java.util.Scanner;

public class no_10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = s.nextLine();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
