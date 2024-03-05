import java.io.*;
import java.util.StringTokenizer;

/**
 * 14501번 퇴사
 * 메모리 : 14196 KB
 * 시간 : 124 m
 * 코드 길이 : 766 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/13458
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] day = new int[n+1][2];
		int[] money = new int[n+1];
		for(int i = 0; i < n; ++i) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
			day[i][0] = Integer.parseInt(tk.nextToken());
			day[i][1] = Integer.parseInt(tk.nextToken());
		}
		
		for(int i = 0; i < n; ++i) {
			if(i + day[i][0] <= n) {
				money[i + day[i][0]] = Math.max(money[i + day[i][0]], money[i] + day[i][1]);							
			}
			money[i+1] = Math.max(money[i+1], money[i]);
		}
		
		System.out.println(money[n]);
	}

}