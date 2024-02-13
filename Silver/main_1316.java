import java.util.*;

/**
 * 1316번 그룹 단어 체커
 * 
 * @author 이태희
 */
public class main_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i < num; i++) {
            String word = sc.next();

            if(word.length() == 1){
                count++;
                continue;
            }

            for (int j = 0; j < word.length()-1; j++) {

                if(word.charAt(j) != word.charAt(j+1) && word.substring(j+1).indexOf(word.charAt(j)) != -1){
                    break;
                }

                if(j == word.length()-2){
                    count++;
                }
            }   
        }
        System.out.println(count);
    }
}

