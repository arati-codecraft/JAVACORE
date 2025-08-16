import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l, b;
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        b = sc.nextDouble();

        System.out.println("Area = " + (l * b));
    }
}
