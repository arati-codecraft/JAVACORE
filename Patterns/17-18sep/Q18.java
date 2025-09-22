/*

Q82. Write a java program to print this pattern.


               1    
           A	    B   
        2		 3  
     B			     C	 	
 4	5	6	7	8
*/


import java.util.*;
public class Q18 {
    public static void main(String args[]) {
        int num = 1;   
            
        char ch='A';        
        //ch='A';  
        for (int i = 1; i <= 5; i++) {
          char ch1=ch ;     
            for (int j = 1; j <= 9; j++) 
     {

               
                if (j == 6 - i || j == 4 + i) 
        	 {

                       if (i % 2 == 1) {
                        System.out.print(num + "\t");
                        num++;
                         } 
                          else {
                        System.out.print(ch1+ "\t");
                        ch1++;
                          }
                       
                    } 
                  
                    else if(i==5&&j%2!=0)
                           {
                               System.out.print(num+"\t");
                                num++;
                            } 
            	  else {
                    System.out.print("\t");
                }
              
            }
            System.out.println();
           if(i%2==0)
          {
              ch++;
          }
        }
    }
}
