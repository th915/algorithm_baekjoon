import java.io.*;
import java.util.*;

public class main_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        HashMap<String, Integer> numbers = new HashMap<>();
        HashMap<Integer, String> names = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        String name;
        for (int i = 1; i <= n; i++) {
            name = br.readLine();
            numbers.put(name, i);
            names.put(i, name);
        }

        String result;
        for (int i = 0; i < m; i++) {
            result = br.readLine();

            if(numbers.get(result) == null){
                sb.append(names.get(Integer.parseInt(result)));
            } else {
                sb.append(numbers.get(result));
            }
            
            if(i != m-1){
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
