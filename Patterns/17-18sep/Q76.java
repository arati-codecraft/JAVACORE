/*Q76. Write a java program to print this pattern.

					A
				#	#	#
                        A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A
*/

import java.util.*;
public class Q76 {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) 
         {
            char ch = 'A';
            for (int j = 1; j <= 9; j++)
               {
                     if ((i<=5) && (j>=6-i&&j<=4+i)||(i>=6 &&j>=i-4))
                             {
                               if(i%2==0)
                                    {
                                       System.out.print("#\t");
                                     }
                                 else
                                   {
                                     System.out.print(ch+"\t");
                                     if(j<5)
                                         ch++;
                                     else
                                        ch--;
                                   }
                              }
                           else
                              System.out.print("\t");
                    }System.out.println();
            }
            
        
    }
}
