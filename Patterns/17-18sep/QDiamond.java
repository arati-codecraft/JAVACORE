import java.util.*;
public class QDiamond{
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) 
         {
            char ch = 'A';
            for (int j = 1; j <= 9; j++)
               {
                     if ((i<=5) && (j>=6-i&&j<=4+i)||(i>=6 &&j>=i-4 && j<=14-i))
                             {
                              
                                       System.out.print("#\t");
                               }
                          else
                             { 
                           System.out.print("\t");
                             }
                }System.out.println();
            }
            
        
    }
}
