import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N개의 정수
        Queue<Integer> queue = new LinkedList<>();

        // queue에 담기
        for(int i = 1 ; i <= N; i++){
            queue.offer(i);
        }

        // queue 사이즈가 1이 될때까지 반복
        while(queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
        br.close();
    }
}
