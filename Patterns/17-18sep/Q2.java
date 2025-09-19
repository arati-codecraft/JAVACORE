/*
Q2. Write a java program to print this pattern.

			A
		     A      B
		A	B	C
	     A	     B	     C	     D
	A	B	C	D	E
*/
import java.util.*;
public class Q2
{
   public static void main (String args[])
        {  
            for (int i=1;i<=5;i++)
                 {
                       char ch='A';
                  
                      boolean flag =false;
                    for (int j=1;j<=10;j++)
                        {
                            if (j>6-i && j<6+i && flag)
                            {
                            System.out.print ((char)ch+" ");
                               flag=false;
                                ch++;   

                             }
                            else {
                            System.out.print("  "); 
                             flag=true;
                            }
                                                      
                         }System.out.println();
                        
                  }
        }
 }