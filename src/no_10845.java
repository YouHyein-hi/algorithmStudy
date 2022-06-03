/*
 * 2022.06.03. 금
 * 10845번 큐
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10845 {
    static int[] queue;
    static int first = 0;
    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        queue = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);

    }

    // 정수 X를 큐에 넣는 연산이다.
    public static void push(int X) {
        queue[last] = X;
        last++;
    }

    // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
    // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int pop() {
        if(last - first == 0)
            return -1;
        else {
            int N = queue[first];
            first++;
            return N;
        }
    }

    // 큐에 들어있는 정수의 개수를 출력한다.
    public static int size() {
        return last - first;
    }

    // 큐가 비어있으면 1, 아니면 0을 출력한다.
    public static int empty() {
        if(last - first == 0)
            return 1;
        else
            return 0;
    }

    // 큐의 가장 앞에 있는 정수를 출력한다.
    // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int front() {
        if(last - first == 0) {
            return -1;
        }else {
            int F = queue[first];
            return F;
        }
    }

    // 큐의 가장 뒤에 있는 정수를 출력한다.
    // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int back() {
        if(last - first == 0) {
            return -1;
        }else {
            int N = queue[last - 1];
            return N;
        }
    }

}
