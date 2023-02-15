package old;/*
 * 2022.04.19.화
 * 4344번 평균은 넘겠지
 * */
import java.util.Scanner;

public class no_4344 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //테스트 케이스 수, 학생 수, 성적 입력
        int array[];

        int testcase = s.nextInt(); //테스트 케이스 수

        for(int i = 0; i < testcase; i++){
            int num = s.nextInt(); // 학생 수 입력
            array = new int[num]; // 학생 수 만큼 배열

            double sum = 0; // 성적 합 변수

            // 성적 입력
            for(int j = 0; j < num; j++){
                int score = s.nextInt(); // 성적 입력
                array[j] = score;
                sum += score;
            }

            double aver = (sum / num); // 평균 변수
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘은 학생 비율
            for(int j = 0; j < num; j++){
                if(array[j] > aver){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/num)*100);
        }
    }
}