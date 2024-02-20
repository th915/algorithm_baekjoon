import java.io.*;

/**
 * 1436번 영화감독 숌
 * 
 * @author 이태희
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = 666;
        int count = 1;

        while(count != N){
            x++;
            if(String.valueOf(x).contains("666")){
                count++;
            }
        }
        System.out.println(x);
    }
}
