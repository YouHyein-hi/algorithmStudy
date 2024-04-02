package programmers;

public class short_amount_calc {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        long answer = -1;
        long moneyResult = 0;

        for(int i = 1; i <= count; i++){
            moneyResult += (long) price * i;
        }

        if(moneyResult >= money) answer = moneyResult - money;
        else answer = 0;

        //return answer;
        System.out.println(answer);
    }
}
