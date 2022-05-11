/*
 * 2022.05.09.월
 * 2839번 설탕배달
 * */
import java.util.Scanner;

public class no_5585 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] coin = {500, 100, 50, 10, 5, 1};
        int num = 0;
        int money = 1000 - s.nextInt();

        for(int i = 0; i < coin.length; i++){
            if(money % coin[i] >= 0){
                num += money / coin[i];
                money = money % coin[i];
            }
        }

        System.out.println(num);
    }
}
