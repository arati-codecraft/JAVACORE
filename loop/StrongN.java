//Q32. Write a java program to display 1 to nth Strong Number.


import java.util.Scanner;

public class StrongN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit (n) to print Strong Numbers up to:");
        int n = sc.nextInt();

        int num = 1;   // start from 1
        while (num <= n) {
            int temp = num;
            int sum = 0;
            int t = num;

            while (t > 0) {
                int rem = t % 10;
                t = t / 10;

                int fact = 1;
                int i = 1;
                while (i <= rem) {
                    fact *= i;
                    i++;
                }
                sum += fact;
            }

            if (sum == temp) {
                System.out.println(temp);
            }

            num++;
        }
    }
}

