
import java.util.*;
public class VehicleManufact
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
          System.out.println(" Enter the value of  total vehicles");
           int v= sc.nextInt();
          System.out.println("Enter the total number of wheels ");
           int w= sc.nextInt();
       if (w < 2 || w % 2 != 0 || v >= w) 
              {
            System.out.println("INVALID INPUT");
        } else {
            int TW = (4 * v - w) / 2;
            int FW =  - TW;
            System.out.println("TW = " + TW);
            System.out.println("FW = " + FW);
        }

             
                
              }
}