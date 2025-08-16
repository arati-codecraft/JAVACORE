import java.util.Scanner;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        double angle1 = sc.nextDouble();
        System.out.print("Enter second angle: ");
        double angle2 = sc.nextDouble();

        double angle3 = 180 - (angle1 + angle2);
        System.out.println("Third angle = " + angle3);

        sc.close();
    }
}
