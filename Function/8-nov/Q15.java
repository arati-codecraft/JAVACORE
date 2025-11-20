//Q15. Write a Java program to return the count of duck elements present in an integer array.

import java.util.*;

public class Q15 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int duckCount = countDuckNumbers(arr);
        System.out.println("Count of duck elements: " + duckCount);
    }

    public static int countDuckNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isDuckNumber(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isDuckNumber(int num) {
        String str = Integer.toString(num);
        return !str.startsWith("0") && str.contains("0");
    }
}