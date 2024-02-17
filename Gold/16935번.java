package Gold;

import java.io.*;
import java.util.*;

/**
 * 16935번 배열 돌리기 3
 * 
 * @author 이태희
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int count = Integer.parseInt(tk.nextToken());

        String[][] arrays = new String[N][M];
        for (int i = 0; i < N; i++) {
            arrays[i] = br.readLine().split(" ");
        }

        tk = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(tk.nextToken());

            switch (number) {
                case 1:
                    int max = arrays.length;
                    for (int j = 0; j < max / 2; j++) {
                        String[] temp = arrays[j];
                        arrays[j] = arrays[max-1-j];
                        arrays[max-1-j] = temp;
                    }
                    break;
                
                case 2:
                    max = arrays[0].length;
                    for (int j = 0; j < arrays.length; j++) {
                        for (int k = 0; k < max / 2; k++) {
                            String temp = arrays[j][k];
                            arrays[j][k] = arrays[j][max-1-k];
                            arrays[j][max-1-k] = temp;
                        }
                    }
                    break;

                case 3:
                    String[][] result = new String[arrays[0].length][arrays.length];
                    max = arrays.length;
                    for (int j = 0; j < arrays.length; j++) {
                        for (int k = 0; k < arrays[0].length; k++) {
                            result[k][max-1-j] = arrays[j][k];
                        }
                    }
                    arrays = result;
                    break;

                case 4:
                    result = new String[arrays[0].length][arrays.length];
                    max = arrays[0].length;
                    for (int j = 0; j < arrays.length; j++) {
                        for (int k = 0; k < arrays[0].length; k++) {
                            result[max-1-k][j] = arrays[j][k];
                        }
                    }
                    arrays = result;
                    break;

                case 5:
                    result = new String[arrays.length][arrays[0].length];
                    int r = arrays.length;
                    int c = arrays[0].length;
                    
                    for (int j = 0; j < r / 2; j++) {
                        for (int k = 0; k < c / 2; k++) {
                            result[j][(c / 2) + k] = arrays[j][k];
                        }
                    }

                    for (int j = 0; j < r / 2; j++) {
                        for (int k = c / 2; k < c; k++) {
                            result[(r / 2) + j][k] = arrays[j][k];
                        }
                    }

                    for (int j = r / 2; j < r; j++) {
                        for (int k = c / 2; k < c; k++) {
                            result[j][k - (c / 2)] = arrays[j][k];
                        }
                    }

                    for (int j = r / 2; j < r; j++) {
                        for (int k = 0; k < c / 2; k++) {
                            result[j - (r / 2)][k] = arrays[j][k];
                        }
                    }

                    arrays = result;
                    break;

                case 6:
                    result = new String[arrays.length][arrays[0].length];
                    r = arrays.length;
                    c = arrays[0].length;
                    

                    for (int j = 0; j < r / 2; j++) {
                        for (int k = 0; k < c / 2; k++) {
                            result[(r / 2) + j][k] = arrays[j][k];
                        }
                    }

                    for (int j = r / 2; j < r; j++) {
                        for (int k = 0; k < c / 2; k++) {
                            result[j][(c / 2) + k] = arrays[j][k];
                        }
                    }

                    for (int j = r / 2; j < r; j++) {
                        for (int k = c / 2; k < c; k++) {
                            result[j - (r / 2)][k] = arrays[j][k];
                        }
                    }

                    for (int j =0; j < r / 2; j++) {
                        for (int k = c / 2; k < c; k++) {
                            result[j][k - (c / 2)] = arrays[j][k];
                        }
                    }
                    arrays = result;
                    break;
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                sb.append(arrays[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
