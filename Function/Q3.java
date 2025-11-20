//Q3. Write a java program to print all alphabets from a to z. - using while loop
import java.util.*;

public class Q3
{
  
  public static void Alphabets()
  {
    char ch;
    for ( ch='a';ch<='z';ch++)
	{
	  System.out.print(ch +"\t");
	  
	}
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("all alphabets from a to z");
	Alphabets();
  }
}