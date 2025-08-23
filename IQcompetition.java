import java.util.*;
public class IQcompetition
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
          System.out.println(" Einstein had an IQ of 170");
          System.out.println("enter the IQ of chef");
          int x= sc.nextInt();
              System.out.println("IQ of chef  before playing instrument ="+x);
            int y=x+7;
            System.out.println("chefs IQ after playing instrument"+y);
       
               if (y>=170)
                  {
                        
                      System.out.println("YES ");
                   }
                  else 
                  {
                     
                     System.out.println(" NO  ");
                      
                   }
                
              }
}