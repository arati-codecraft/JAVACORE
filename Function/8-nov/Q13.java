/*
Q13. Write a Java program to calculate the difference between the largest and smallest numbers in an array.
Return that difference.
*/
import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int diff = findDifference(arr);
        System.out.println("Difference between largest and smallest elements: " + diff);
    }

    public static int findDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }
}