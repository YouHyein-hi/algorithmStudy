package old1;/*
 * 2022.06.05.일
 * 2609번 최대공약수와 최소공배수
 * */
import java.util.Scanner;

public class no_2609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if(num2 > num1){
            int temp;

            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i = num1; i < 100000000; i++){
            if(i % num1 == 0 && i % num2 ==0){
                System.out.println(i);
                break;
            }
        }

        for(int i = num2; i > 0; i-- ){
            if(num2 % i == 0 && num1 % i == 0){
                System.out.println(i);
                break;
            }
        }

    }
}
