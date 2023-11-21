package baekjoon.old1;/*
 * 2022.04.29.금
 * 5622번 다이얼
 * */
import java.util.Scanner;

public class no_5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String dir = s.nextLine();
        int num = 0;

        for(int i = 0; i < dir.length(); i++){
            switch (dir.charAt(i)){
                case 'A': case 'B': case 'C':
                    num += 3;
                    break;
                case 'D': case 'E': case 'F':
                    num += 4;
                    break;
                case 'G': case 'H': case 'I':
                    num += 5;
                    break;
                case 'J': case 'K': case 'L':
                    num += 6;
                    break;
                case 'M': case 'N': case 'O':
                    num += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    num += 8;
                    break;
                case 'T': case 'U': case 'V':
                    num += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    num += 10;
                    break;
                default:
                   num += 1;
                   break;
            }
        }

        System.out.println(num);
    }
}

/* 더 간단하고 짧게 가능함! 다음에 다시 해보기 */