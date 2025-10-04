/*
Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find sum of divisors and compare with the number, then count.

*/
import java.util.*;

public class Q9 
{
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
            int sum = 0;
            for (int j = 1; j <= a[i] / 2; j++) 
            { 
                if (a[i] % j == 0) {
                    sum += j;
                }
            }
            if (sum == a[i]) {
                count++;
            }
        }

        System.out.println("Count of Perfect numbers: " + count);
    }
}
