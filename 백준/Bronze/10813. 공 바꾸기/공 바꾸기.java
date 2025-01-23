import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] box = new int[N];
		
		for(int i = 1 ; i <= N ; i++){
			box[i - 1] = i;
		}
		
		for(int i = 0 ; i < M ; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int temp = 0;
			temp = box[a-1];
			box[a-1] = box[b-1];
			box[b-1] = temp;
		}
		for(int num : box){
			System.out.print(num + " ");
		}
	}
}