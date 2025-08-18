import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        String result = (Math.sqrt(num) % 1 == 0) ? "Perfect Square" : "Not Perfect Square";
        System.out.println(result);
    }
}
