//prime  num
import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 2, sum = 0;   // start from 2 (first prime)

        while (i <= n) {
            int j = 2;
            boolean isPrime = true;

            while (j <= i / 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                sum += i;
            }

            i++;
        }

        System.out.println("Sum of prime numbers between 1 to " + n + " is: " + sum);
        sc.close();
    }
}
