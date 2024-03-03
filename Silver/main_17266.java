import java.io.*;
import java.util.*;

/**
 * 17266번 어두운 굴다리
 * 메모리 : 23232 KB
 * 시간 : 296 m
 * 코드 길이 : 911 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/17266
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int max = Integer.parseInt(tk.nextToken());
        int prev = max;
        int start = prev;

        while(tk.hasMoreTokens()){
            int tmp = Integer.parseInt(tk.nextToken());
            if (tmp - prev > max){
                max = tmp - prev;
            }
            prev = tmp;
        }

        max = (int) Math.ceil((double) max / 2);

        if (n - prev >= max){
            max = n - prev;
        }
        
        if (start >= max){
            max = start;
        }

        System.out.println(max);
    }
}