import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();

        String result = (a + b > c && a + c > b && b + c > a) ? "Valid Triangle" : "Invalid Triangle";
        System.out.println(result);
    }
}
