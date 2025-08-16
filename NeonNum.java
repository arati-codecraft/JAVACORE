import java.util.Scanner;
public class NeonNum
{
   public static void main (String args[])
   {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the no tocheck whether it is neon or not");
     int num=sc.nextInt();
    int square =num*num;
    System.out.println("the square is "+square);

   int sum=0;
sum += square % 10;
            square /= 10;

sum += square % 10;
            square /= 10;

String result=(sum==num)?"neon num":"not neon";
System.out.println(result);
     

    
    
   }
}