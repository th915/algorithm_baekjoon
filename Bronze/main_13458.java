import java.io.*;
import java.util.*;

/**
 * 13458번 시험 감독
 * 메모리 : 92080 KB
 * 시간 : 476 m
 * 코드 길이 : 935 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/13458
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long count = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] -= B;
            count++;
            
            if (A[i] > 0) {
                count += A[i] / C;
                if (A[i] % C != 0)
                    count++;
            }
        }

        System.out.print(count);
    }
}
