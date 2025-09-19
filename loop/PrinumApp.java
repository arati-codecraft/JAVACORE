import java.util.*;

public class PrinumApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print prime numbers up to:");
        int n = sc.nextInt();

        int num = 2; // start from 2 because 1 is not prime
        while (num <= n) {
            int i = 2;
            int count = 0;

            while (i <= num /2) {
                if (num % i == 0) {
                    count++;
                    break; // no need to check further if divisible
                }
                i++;
            }

            if (count == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
