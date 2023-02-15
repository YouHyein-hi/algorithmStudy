package old;/*
 * 2022.05.05.목
 * 1110번
 * */
import java.util.Scanner;

public class no_1110 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, num, left, right;
        int count = 0;

        n = s.nextInt();
        num = n;

        while(true){
            left = n / 10;
            right = n % 10;
            n = (right * 10) + ((left + right) % 10);
            count++;
            if(n == num){
                break;
            }
        }
        System.out.print(count);
    }
}
