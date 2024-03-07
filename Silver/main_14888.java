import java.io.*;
import java.util.StringTokenizer;

/**
 * 14888번 연산자 끼워넣기
 * 메모리 : 15076 KB
 * 시간 : 132 m
 * 코드 길이 : 2011 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/14888
 */
public class main_14888 {

    public static int N;
    public static int[] numbers;
    public static int[] sign;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(tk.nextToken());
        }

        tk = new StringTokenizer(br.readLine());
        sign = new int[4];


        for (int i = 0; i < 4; i++) {
            int tmp = Integer.parseInt(tk.nextToken());
            sign[i] = tmp;
        }

        findNum(1, numbers[0]);
        System.out.println(max);
        System.out.println(min);

    }

    public static void findNum(int x, int y){
        if (x == N-1){
            for (int i = 0; i < 4; i++) {
                if (sign[i] > 0){
                    int tmp = calc(y, numbers[x], i);
                    max = Math.max(max, tmp);
                    min = (min < tmp)? min : tmp;
                }
            }
        }

        for (int j = 0; j < 4; j++) {
            if (sign[j] > 0){
                sign[j] -= 1;
                findNum(x+1, calc(y, numbers[x], j));
                sign[j] += 1;
            }
        }

    }

    public static int calc(int x, int y, int z){
        if (z == 0){
            return x + y;
        } else if (z == 1){
            return x - y;
        } else if (z == 2){
            return x * y;
        } else {
            if (x < 0 || y < 0){
                if (x < 0){
                    x *= -1;
                } else {
                    y *= -1;
                }
                return (int) (x / y * -1);
            }
            return (int) (x / y);
        }
    }
}
