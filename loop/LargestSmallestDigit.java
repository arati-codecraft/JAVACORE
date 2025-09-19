/*Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.*/
import java.util.Scanner;

public class LargestSmallestDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int max = 0;
        int min = 9;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            temp /= 10;
        }

        System.out.println("Largest digit: " + max);
        System.out.println("Smallest digit: " + min);
    }
}
