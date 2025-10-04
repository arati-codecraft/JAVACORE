/*Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements
*/

import java.util.*;

public class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int s = sc.nextInt();

        int a[] = new int[s];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < s; i++) {
            int num = a[i];
            if (num > 1) 
      { 
                boolean isPrime = true;
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }

        System.out.println("Count of prime numbers: " + count);
    }
}
