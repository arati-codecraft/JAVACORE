import java.util.*;
public class WLAPP
{
     public static void main (String args[])
       {
            Scanner sc=new Scanner (System.in);
             System.out.println("Enter the num");
             int no=sc.nextInt();
             
             int i=1;
              int sum=0;
             while(i<no)
                 {
                      if (no%i==0)
                      {
                     sum=sum+i;
                        }
                i++;
                  }
               String msg=(sum==no)?"no is perfect":"no is not perfect";
               System.out.println(msg);

        }
}