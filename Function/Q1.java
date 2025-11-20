//Q1. Write a java program to print all natural numbers from 1 to n. using function

import java.util.*;

public class Q1 {

    
    public static void NatNum(int lim) {
        for (int i = 1; i <= lim; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit to print natural numbers:");
        int lim = sc.nextInt();

        NatNum(lim);
        sc.close();
    }
}