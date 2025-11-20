//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;

public class Q2 {
    
    public static void RevNatNum(int i, int n) 
	{
        if (n>=1) 
		{
            System.out.println(n);
		
            RevNatNum(i,--n);
        }
         
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        RevNatNum(1, n); 
    }
}