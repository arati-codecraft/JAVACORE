/*
Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]  ****
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.
*/
import java.util.*;

public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

       
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        for(int i = 0; i < n; i++) {
            int fact = 1;
            for(int j = 1; j <= arr[i]; j++) {
                fact = fact * j;
            }
            System.out.println("Factorial of " + arr[i] + " = " + fact);
        }
    }
}