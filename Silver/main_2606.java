import java.io.*;
import java.util.StringTokenizer;

/**
 * 2606번 바이러스
 * 
 * @author 이태희
 */
public class Main {

    public static int[][] arrays;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int num = Integer.parseInt(br.readLine());
        int connect = Integer.parseInt(br.readLine());

        visited = new boolean[num + 1];
        arrays = new int[connect][2];

        for (int i = 0; i < connect; i++) {
            tk = new StringTokenizer(br.readLine());
            arrays[i][0] = Integer.parseInt(tk.nextToken());
            arrays[i][1] = Integer.parseInt(tk.nextToken());
        }

        int count = dfs(1);

        System.out.println(count - 1);
    }

    public static int dfs(int start){
        visited[start] = true;
        int count = 1;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][0] == start && !visited[arrays[i][1]]) {
                count += dfs(arrays[i][1]);
            } else if (arrays[i][1] == start && !visited[arrays[i][0]]) {
                count += dfs(arrays[i][0]);
            }
        }
        return count;
    }
}