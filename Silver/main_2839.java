import java.io.*;

/**
 * 2839번 설탕 배달
 * 
 * @author 이태희
 */
public class main_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        while (n > 0){
            if(n % 5 == 0){
                count += n/5;
                break;
            }
            if(n < 3){
                count = -1;
                break;
            }
            n -= 3;
            count++;
        }

        System.out.println(count);
    }
}
