//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class ASCIIAPP
{
       public static void main (String args[])
         {
             Scanner sc=new Scanner (System.in);
             System.out.println("ASCII keys are with their value");
            int i=0;
            while(i<=255)
                 {
                    System.out.println(i + " = " + (char)i);
                   i++;
                 }
          } 
}