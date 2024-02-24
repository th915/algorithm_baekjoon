import java.io.*;
import java.util.StringTokenizer;

/**
 * 2512번 예산
 * 
 * @author 이태희
 */ 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int money = Integer.parseInt(br.readLine());

		int max = 0;
		int[] arrays = new int[N];
		for (int i = 0; i < N; i++) {
			arrays[i] = Integer.parseInt(tk.nextToken());
			max = Math.max(max, arrays[i]);
		}

		int start = 0;
		int end = max;
		int mid;
		int result = 0;

		while (start <= end){
			mid = (start + end) / 2;
			
			int total = 0;
			for (int i : arrays) {
				total += Math.min(i, mid);
			}

			if (money >= total){
				result = mid;
				start = mid + 1;
			} else {
				end = mid -1;
			}
		}

		System.out.println(result);
	}
}