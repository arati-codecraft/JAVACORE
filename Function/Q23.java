/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/


import java.util.Scanner;

public class Q23 {
    public static boolean isDuck(int num) {
        // Remove leading digits until we hit the first non-zero digit
        // If the first digit is zero, it's not a Duck number
        if (num == 0) 
			return false;

        // Check if the first digit is zero
        int firstDigit = num;
        while (firstDigit >= 10) 
		{
            firstDigit /= 10;
        }
        if (firstDigit == 0)
			{
            return false;
            }

        // Check for zero in the rest of the digits
        while (num > 0) 
		{
            int rem = num % 10;
            if (rem == 0) 
			{
                return true;
            }
            num /= 10;
        }

        return false;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's Duck: ");
        int n = sc.nextInt();

        if (isDuck(n)) 
		{
            System.out.println(n + " is a Duck Number.");
        } else 
		{
            System.out.println(n + " is NOT a Duck Number.");
        }
    }
}