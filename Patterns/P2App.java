import java.util.*;
public class P2App
{
       public static void main (String args[])
       {
      Scanner sc=new Scanner (System.in);
     
       
       for (int i=1; i<=5; i++)
         {
               for (int j=1; j<=5 ; j++)
              {
                  if(i==1 || j==1 || i==5 || j==5)

                    {
                       System.out.print("*  ");
                     }
                      else
                       {
                          System.out.print("   ");
                       }
                   
               }  
              System.out.println( );
          }
     }
}