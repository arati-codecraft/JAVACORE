//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class ASCIIKEY
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("ASCII keys are with their value");
            int i=0;
            do
                 {
                    System.out.print(i + " = " + (char)i +"\t");
                   i++;
                 }while ((i<=255));

        }
}