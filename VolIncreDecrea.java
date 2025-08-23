import java.util.*;
public class VolIncreDecrea
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the value to increase and decrease the sound:");
          int x= sc.nextInt();
          int y=sc.nextInt();
         
               if (x<y)
                  {
                     int z=(y-x);
                     System.out.println(" volume increased by "+z);
                   }
                  else if (x>y)
                  {
                      int z=(x-y);
                     System.out.println(" volume decreased by "+z);
                   }
                else
                  {
                     System.out.println(" there is change happen in Volume ");
                  }
              }
}