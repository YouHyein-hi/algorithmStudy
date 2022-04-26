/*
 * 2022.04.24.일
 * 2750번 수 정렬하기
 * */
import java.util.Scanner;

public class no_2750 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int temp;
        int n = s.nextInt();  // 입력할 숫자 수 입력
        int[] arr = new int[n];  // 수 만큼 배열 방 만들기

        for(int i = 0; i < n; i++){  // 배열 방 수만큼 입력하기
            arr[i] = s.nextInt();
        }

        // 삽입정렬
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else break;
            }
        }

        for (int result : arr) {
            System.out.println(result);
        }
    }
}

/*선택정렬, 삽입정렬, Arrays.sort 등 사용 가능하다고 생각*/
