import java.io.*;

/**
 * 2023번 신기한 소수
 * 
 * @author 이태희
 */
public class Main {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dfs(0, n);

        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        double number = Math.sqrt(n);
        for (int i = 2; i <= number; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void dfs(int num, int n) throws IOException {
        if (n == 0){
            bw.write(Integer.toString(num));
            bw.newLine();
        }
        for (int i = 1; i < 10; i++) {
            int temp = 10 * num + i;
            if(n > 0 && isPrime(temp)){
                dfs(temp, n-1);
            }
        }
    }
}