//Q31. Write a java program to display 1 to nth Duck Number.

import java.util.*;

public class Duck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit (n) to print Duck numbers up to:");
        int n = sc.nextInt();

        int num = 1;   // start from 1
        while (num <= n) {
            int temp = num;
            boolean flag = false;

            // check digits of temp
            while (temp != 0) {
                int rem = temp % 10;
                if (rem == 0) {
                    flag = true;
                    break;
                }
                temp = temp / 10;
            }

            if (flag) {
                System.out.println(num);
            }
            num++;
        }
    }
}
