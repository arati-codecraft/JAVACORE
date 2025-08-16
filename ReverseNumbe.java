import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        String reverse = new StringBuilder(num).reverse().toString();

        // Using ternary operator to display result
        System.out.println(num.equals(reverse) ? "Palindrome: " + reverse : "Reverse: " + reverse);

        sc.close();
    }
}
