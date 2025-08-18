import java.util.Scanner;
public class MinNum3{
               public static void main (String args[])
                 {
                    Scanner sc=new Scanner(System.in);
                    int a,b,c;
                    System.out.println("Enter the three number");
                     a=sc.nextInt();
                     b=sc.nextInt();
                     c=sc.nextInt();
                    System.out.println("number1 is"+a);
                     System.out.println("number1 is"+b);
                    System.out.println("number1 is"+c);
                   String result =(a<b)?"num1":(a>b && b<c)?"num2":"num3";
                  System.out.println("Smaller is  "+result);

                    }

}