import java.util.Scanner;

/**
 * 1244번 스위치 켜고 끄기
 * 
 * @author 이태희
 */
public class main_1244 {

    public static int[] arrays;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        arrays = new int[num+1];
        for (int i = 1; i <= num; i++) {
            arrays[i] = sc.nextInt();
        }

        int person = sc.nextInt();
        for (int i = 0; i < person; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y == num && (x == 2 && y == 1)){
                change(y);
            } else if (x == 1){
                for (int j = y; j < arrays.length; j += y) {
                    change(j);
                }
            } else {
                int j = 1;
                change(y);
                while(y+j < arrays.length && y-j > 0){
                    if(arrays[y+j] != arrays[y-j]){
                        break;
                    }
                    change(y+j);
                    change(y-j);
                    j++;
                }
            }
        }

        for (int i = 1; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
            if(i % 20 == 0){
                System.out.print("\n");
            }
        }
        
    }

    public static void change(int a){
        arrays[a] = (arrays[a] == 0)? 1 : 0;
    }
}
