//Q3. Write a java program to print all alphabets from a to z. - using while loop

import java.util.*;

public class Q3 {
    
    public static void RevNatNum(char ch) 
	{
        if (ch<='z') 
		{
            System.out.println(ch);
		
            RevNatNum(++ch);
        }
         
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Alaphabets from a to z");
        RevNatNum('a'); 
    }
}