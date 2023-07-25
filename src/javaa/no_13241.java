package javaa;
/*
 * 2023.07.25.수
 * 13241 최소공배수
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] AB = br.readLine().split(" ");
        long A = Long.parseLong(AB[0]);
        long B = Long.parseLong(AB[1]);

        System.out.println(A * B / GDB(A, B));

    }

    public static long GDB(long A, long B){
        while(B!=0){
            long X = A%B;
            A = B;
            B = X;
        }
        return A;
    }

}
