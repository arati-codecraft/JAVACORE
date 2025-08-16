import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fah = sc.nextDouble();

        double cel = (fah - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + cel);

        sc.close();
    }
}
