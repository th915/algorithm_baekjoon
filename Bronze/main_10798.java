import java.io.*;

public class main_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = new String[5];

        for (int i = 0; i < 5; i++) {
            input[i] = br.readLine();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(input[j].length() > i ){
                    System.out.print(input[j].charAt(i));
                }
            }
        }
    }
}
