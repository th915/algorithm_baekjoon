import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();

        if(minute + time >= 60){
            hour = hour + ((minute + time) / 60);
            minute = (minute + time) % 60;
        } else {
            minute = minute + time;
        }

        if(hour >= 24) {
            hour = hour - 24;
        }

        System.out.println(hour + " " + minute);
        sc.close();
    }
}
