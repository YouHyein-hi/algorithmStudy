/*
 * 2022.05.14.토
 * 11653번 소인수분해
 * */
import java.util.Scanner;

public class no_11653 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int i = 2;

        if(N == 1){
            System.out.println();
        }
        else{
            while (N >= i){
                if(N%i == 0){
                    System.out.println(i);
                    N /= i;
                }
                else i++;
            }
        }
    }
}
