/*
*********
*    * *    *   
* *      *  *
**         **
*             *
* *        **
*  *    *   * 
*    * *    *
*********
*/
import java.util.*;
public class Diamond42
{
     public static void main (String args[])
          {
             for (int i=1;i<=9;i++)
                 {
                     for(int j=1;j<=9;j++)
                       {
                           if(i==9||j==9||i==1||j==1||j==6-i||j==4+i||i+j==14||i==4+j)
                            {
                                 System.out.print("*");
                             }
                            else
                              {
                                 System.out.print(" ");
                               }
                        }System.out.println();
                  }
           }
}