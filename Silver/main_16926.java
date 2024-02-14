import java.io.*;
import java.util.StringTokenizer;

/**
 * 16926번 배열 돌리기 1
 * 
 * @author 이태희
 */
public class main_16926 {

    public static int[][] arrays;
    public static int n;
    public static int m;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        count = Integer.parseInt(tk.nextToken());

        arrays = new int[n][m];
        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrays[i][j] = Integer.parseInt(tk.nextToken());
            }
        }

        for (int i = 0; i < count; i++) {
            roll(0, 0, n-1, m-1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arrays[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void roll(int x, int y, int xEnd, int yEnd){
        if(x >= xEnd || y >= yEnd){
            return;
        }
        
        int i = x;
        int j = y;
        int temp = arrays[x][y];
        while(j < yEnd){
            arrays[i][j] = arrays[i][j+1];
            j++;
        }

        while(i < xEnd){
            arrays[i][j] = arrays[i+1][j];
            i++;
        }

        while(j > y){
            arrays[i][j] = arrays[i][j-1];
            j--;
        }

        while(i > x){
            arrays[i][j] = arrays[i-1][j];
            i--;
        }

        arrays[x+1][j] = temp;

        roll(x+1, y+1, xEnd-1, yEnd-1);
    }
}
