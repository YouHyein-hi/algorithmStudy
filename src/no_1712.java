/*
 * 2022.05.22.일
 * 1712번 손익분기점
 * */
import java.util.Scanner;

public class no_1712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result;
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if(C <= B)
            System.out.println("-1");
        else{
            result = A / (C - B) + 1;
            System.out.println(result);
        }
    }
}
