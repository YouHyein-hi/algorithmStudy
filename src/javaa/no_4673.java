/*
 * 2023.03.21.화
 * 4673번 셀프 넘버
 */

package javaa;

import java.io.IOException;

public class no_4673 {
    public static void main(String[] args) throws IOException {
        boolean[] array = new boolean[10001];
        int i;

        for(i = 1; i <= 10000; i++){
            int n = selfnum(i);

            if(n <= 10000)
                array[n] = true;
        }

        for(i = 1; i <= 10000; i++){
            if(array[i] == false)
                System.out.println(i);
        }
    }

    public static int selfnum(int num){
        int sum = num;

        while (num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
