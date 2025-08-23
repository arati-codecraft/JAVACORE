import java.util.*;
public class ManipulationApp
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println(" Enter the no.of guard that Ezio can manipulate ");
          int x= sc.nextInt();
          
           System.out.println(" enter the total no of guard");
          int y=sc.nextInt();

           System.out.println(x);
          System.out.println(" total guard ="+y);
         
               if (x>y||x==y)
                  {
                        
                      System.out.println("YES");
                   }
                  else 
                  {
                     
                     System.out.println(" NO ");
                      
                   }
                
              }
}