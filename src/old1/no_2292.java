package old1;/*
 * 2022.05.08.일
 * 2292번 벌집
 * */
import java.util.Scanner;

public class no_2292 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int layer = 1;
        int range = 2;

        if(n == 1)
            layer = 1;
        else {
            while (range <= n){
                range = range + (6 * layer);
                layer++;
            }
        }

        System.out.println(layer);
    }
}
