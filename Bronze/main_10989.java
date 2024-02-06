import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arrays = new int[num];

        for (int i = 0; i < num; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arrays);
    
        for (Integer integer : arrays) {
            sb.append(integer + "\n");
        }

        System.out.println(sb.toString());
    }
}
