import java.util.Scanner;

/**
 * 1747번 소수&팰린드롬
 * 
 * @author 이태희
 */
public class main_1747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrays = new int[1_003_002];


        if(size == 1){
            System.out.println(2);
        } else {
            arrays = prime(arrays);
            for (int i = size; i < arrays.length; i++) {
                if (arrays[i] == 0 && palindrome(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static int[] prime(int[] arrays){
        for (int i = 2; i < Math.sqrt(arrays.length) + 1; i++) {
            for (int j = 2; i * j < arrays.length; j++) {
                arrays[i * j] = 1;
            }
        }
        return arrays;
    }

    public static boolean palindrome(int number){
        String x = String.valueOf(number);
        int y = x.length();

        for (int i = 0; i < y / 2; i++) {
            if(x.charAt(i) != x.charAt(y - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
