/*
1
1       2
1       2       3
1       2       3       4
1       2       3       4       5
*/
import java.util.*;
public class NUMTri5Q4
{
	public static void main (String args[])
		{
                      Scanner sc=new Scanner(System.in);
                      int count =1;
                      for (int i=1;i<=5;i++)
                           {
                                for(int j=1;j<=5;j++)
                                      {
                                           if(i>=j)
                                                {
                                          System.out.print(j+"\t");
                                            
                                              }                                      
                                       }System.out.println();
                            }   
		}
}