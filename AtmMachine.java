import java.util.*;
public class AtmMachine
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println(" Enter the amt pooja wants to withdraw from ");
          double x= sc.nextInt();
           System.out.println(" the amt pooja  get withdraw from atm "+x);
           System.out.println(" enter the initial account balance ");
          double y=sc.nextInt();
          System.out.println(" the initial account balance "+y);
         
               if (x%5==0&&x<y)
                  {
                       double z=((y-x)-0.50);
                      System.out.println(" remaining balance after withdraw "+z);
                   }
                  else if ((x%5)!=0)
                  {
                     
                     System.out.println(" incorrect withdrawl amt ");
                      System.out.println(" total account balance "+y);
                   }
                else 
                  {
                     System.out.println(" insufficient funds");
                  }
              }
}