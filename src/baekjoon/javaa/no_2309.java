package baekjoon.javaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] dwarf = new int[9];

        for(int i = 0; i < dwarf.length; i++){
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        Arrays.sort(dwarf);

        int x = 0, y = 0;
        for(int i = 0; i < dwarf.length-1; i++){
            for(int j = i+1; j < dwarf.length; j++){
                if(sum - dwarf[i] - dwarf[j] == 100){
                    x = dwarf[i];
                    y = dwarf[j];
                    break;
                }
            }
        }

        for(int i = 0; i < dwarf.length; i++){
            if(dwarf[i] == x || dwarf[i] == y) continue;
            System.out.println(dwarf[i]);
        }

    }
}
