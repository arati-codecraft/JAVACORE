//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;

public class Q9 {
    static int i = 1; // counter variable

    public static void MulTable(int n) {
        if (i <= 10) {  // base condition
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;  // increment i
            MulTable(n);  // recursive call with same n
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print its multiplication table:");
        int n = sc.nextInt();

        MulTable(n);
    }
}
