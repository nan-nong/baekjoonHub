import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        // N개 주어졌을 때, 오름차순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // N
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

//        list.sort((s1, s2) -> s1 - s2); // 아래와 같이 변경할 수 있다.
        list.sort(Integer::compareTo);
        list.forEach(n -> System.out.println(n));
    }
}
