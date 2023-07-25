/*
 * 2023.03.21.화
 * 2839번 설탕 배달
 */

package old2;

import java.io.*;

public class no_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int bag = 0;
        int N = Integer.parseInt(br.readLine());

        while (true){

            if((N%5) == 0){
                bag += N / 5;
                System.out.println(bag);
                break;
            }
            else{
                N -= 3;
                bag++;
            }

            // 정확하게 N킬로그램을 만들 수 없다면 -1 을 출력한다
            if(N < 0){
                System.out.println("-1");
                break;
            }

        }
    }
}
