import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());     // N명의 회원수
        String[][] member = new String[N][2];
        String[] str;
        
        // 멤버 저장
        for(int i = 0 ; i < N ; i++){
            str = br.readLine().split(" "); // 공백으로 자르기 나이, 이름 순
            member[i][0] = str[0];
            member[i][1] = str[1];
        }
        
        // 멤버 정렬
        Arrays.sort(member, new Comparator<>(){
            @Override
            public int compare(String[] o1, String[] o2){
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        
        for(int i = 0 ; i < N ; i++){
            System.out.print(member[i][0] + " ");
            System.out.println(member[i][1]);
        }
        br.close();
    }
}