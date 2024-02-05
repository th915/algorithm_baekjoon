import java.util.Scanner;

public class main_1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int x = 0;
        int y = 0;

        String[][] room = new String[size + 2][size + 2];

        for (int i = 0; i < room.length; i++) {
            room[0][i] = "X";
            room[i][0] = "X";
            room[room.length-1][i] = "X";
            room[i][room.length-1] = "X";
        }

        for (int i = 1; i < room.length -1; i++) {
            String line = sc.nextLine();
            String[] input = line.split("");
            for (int j = 1; j < room.length -1; j++) {
                room[i][j] = input[j-1];
            }
        }

        for (int i = 1; i < room.length -1; i++) {
            for (int j = 2; j < room.length - 1; j++) {
                if(room[i][j-1].equals(".") && room[i][j].equals(".") && room[i][j+1].equals("X")){
                    x++;
                }
            }
        }

        for (int i = 1; i < room.length -1; i++) {
            for (int j = 2; j < room.length -1; j++) {
                if(room[j-1][i].equals(".") && room[j][i].equals(".") && room[j+1][i].equals("X")){
                    y++;
                }
            }
        }

        System.out.println(x + " " + y);
        sc.close();
    }
}
