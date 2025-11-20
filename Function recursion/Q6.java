//Q6. Write a java program to find the sum of all natural numbers between 1 to n

import java.util.*;

public class Q6 {
    static int sum=0;
    public static void printNaturalNumbers(int i, int n)
	{   
        if (i <= n) {
		   sum=sum+i;
           
           printNaturalNumbers(++i, n);  
        }
		else
		{
			System.out.println(sum);
		}
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        printNaturalNumbers(1, n); 
    }
}
