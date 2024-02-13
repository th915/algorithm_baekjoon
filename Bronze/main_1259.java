import java.util.Scanner;

/**
 * 1259번 팰린드롬수
 * 
 * @author 이태희
 */
public class main_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;

        while (true) {
            String check = "yes";
            num = sc.nextInt();

            if(num == 0){
                break;
            }

            String[] number = String.valueOf(num).split("");
            int size = number.length;

            for (int i = 0; i <= size / 2; i++) {
                if(!number[i].equals(number[size-1-i])){
                    check = "no";
                    break;
                }
            }
            System.out.println(check);
        }
    }
}
