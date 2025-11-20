//Q15. Write a java program to print all ASCII characters with their values.

import java.util.*;

public class Q15
{
  public static void ASCII(int i)
  {
    if(i<=127)
	{
      System.out.println("Character: " + (char)i + "  ASCII Value: " + i);
	  ASCII(++i);
	}
	
  }
   
  public static void main(String args[])
  {
    
	System.out.println("all ascii values and key ");
	ASCII(1);
  }
}


















