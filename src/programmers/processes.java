package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class processes {
    public static void main(String[] args) throws IOException {
        int[] priorities = {2, 3, 1, 2};
        int location = 2;
        int answer = 0;
        //Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());


        for(int i = 0; i < priorities.length; i++){
            queue.add(priorities[i]);
        }

        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == queue.peek()){
                    queue.poll();
                    answer++;
                    if(i == location) {
                        queue.clear();
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
