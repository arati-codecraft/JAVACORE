import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int sec = sc.nextInt();

        int hours= sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;

        System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");
        sc.close();
    }
}
