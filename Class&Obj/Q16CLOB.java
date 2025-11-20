/*16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/

import java.util.*;

class MultiplicationTable
{
  private int num;
  private Scanner sc=new Scanner (System.in);
  public void setTable()
  {
    System.out.println("Enter the number you want to print the table");
	num=sc.nextInt();
	
  }
  public void getTable()
  {
    for(int i=1;i<=10;i++)
	{
	  System.out.println(num*i);
	}
  }
}
public class Q16CLOB
{
  public static void main(String args[])
  {
    MultiplicationTable mt=new MultiplicationTable();
	mt.setTable();
	mt.getTable();
  }
}