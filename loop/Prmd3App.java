/*Q3. Write a java program to print this pattern.

*
*	*
* 		*
*  			*
*	*	*	*	*

*/

import java.util.*;
public class Prmd3App
{
     public static void main (String args[])
       {
            for (int i=1 ; i<=5 ; i++)
               {
                    for (int j=1 ; j<=i; j++)
                       {
                         System.out.print("*");
                        }
                     System.out.println( );
                }
        }
}