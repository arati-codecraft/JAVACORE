//Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;

public class Q19 {
    public static int sumFirstLastDigit(int n) 
	{
        int lastDigit = n % 10;

  
        int firstDigit = n;
        while (firstDigit >= 10) 
		{
            firstDigit /= 10;
        }

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = sumFirstLastDigit(num);
        System.out.println("Sum of first and last digit: " + sum);
    }
}
  