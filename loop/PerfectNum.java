import java.util.*;

public class PerfectNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit (n) to print perfect numbers up to:");
        int n = sc.nextInt();

        int num = 1;   // start checking from 1
        while (num <= n) {
            int i = 1, sum = 0;

            // find sum of divisors of num
            while (i <= num / 2) {
                if (num % i == 0) {
                    sum += i;
                }
                i++;
            }

            // check perfect number condition
            if (sum == num && num != 0) {
                System.out.println(num);
            }

            num++;
        }
    }
}
