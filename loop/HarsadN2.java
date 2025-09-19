import java.util.*;
//Q39. Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.

public class HarsadN2 {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit (n):");
        int n = sc.nextInt();

        System.out.println("Harshad numbers from 1 to " + n+ " are:");

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;

          
            int num = i;
            while (num != 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }

           
            if (temp %sum == 0) 
             {
                System.out.print(temp + " ");
               }
        
        }
    }
}
