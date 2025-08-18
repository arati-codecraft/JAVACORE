import java.util.Scanner;
public class MaxNum2
{
   public static void main( String args[])
    {
       Scanner sc=new Scanner(System.in);
                    int a,b;
                    System.out.println("Enter the two number");
                     a=sc.nextInt();
                     b=sc.nextInt();
                    
                    System.out.println("number1 is"+a);
                     System.out.println("number1 is"+b);
                    
                   String result =(a>b)?"num1":"num2";
                  System.out.println("Greater is  "+result);
     
     }
}