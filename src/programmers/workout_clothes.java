package programmers;

import java.util.*;

public class workout_clothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n 입력 받기
        System.out.print("n을 입력하세요: ");
        int n = scanner.nextInt();

        // lost 배열 입력 받기
        System.out.print("lost 배열의 크기를 입력하세요: ");
        int lostSize = scanner.nextInt();
        int[] lost = new int[lostSize];
        System.out.println("lost 배열의 요소를 입력하세요:");
        for (int i = 0; i < lostSize; i++) {
            lost[i] = scanner.nextInt();
        }

        // reserve 배열 입력 받기
        System.out.print("reserve 배열의 크기를 입력하세요: ");
        int reserveSize = scanner.nextInt();
        int[] reserve = new int[reserveSize];
        System.out.println("reserve 배열의 요소를 입력하세요:");
        for (int i = 0; i < reserveSize; i++) {
            reserve[i] = scanner.nextInt();
        }

        int answer = 0;
        try{
            Arrays.sort(reserve);
            Arrays.sort(lost);

            // 도난당하지 않은 횟수
            answer = n - lost.length;

            // 여벌 체육복을 가져왔지만 도난당한 학생 수
            // 다른 학생에게 체육복을 빌려줄 수 없음
            // 그렇다면 reserve에 lost의 번호가 있다면
            // answer+1을 하고 그 번호를 reserve에서 빼자!
            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] == reserve[j]) {
                        answer++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            // 도난당했지만 체육복을 빌릴 수 있는 학생 수
            // 이제 lost+1 lost-1해서 reserve와 비교 후 answer+1하기
            for(int i = 0; i < lost.length; i++){
                int lostStudent = lost[i];
                int lostStudentMin = lostStudent-1;
                int lostStudentMax = lostStudent+1;

                for(int j = 0; j < reserve.length; j++){
                    if(reserve[j] == lostStudentMin || reserve[j] == lostStudentMax){
                        reserve[j] = -1;
                        answer++;
                        break;
                    }

                }
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("체육복을 가지고 있는 최대 학생 수: " + answer);

    }
}
