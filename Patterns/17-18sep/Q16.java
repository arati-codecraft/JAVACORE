/*
Q80. Write a java program to print this pattern.
A      						A
A	B    					B	A
A	B	C  			C	B	A
A	B	C	D	D	C	B	A
A	B	C  			C	B	A
A	B   					B	A
A							A

*/

import java.util.*;
public class Q16 {
    public static void main(String args[]){
       
        for (int i = 1; i <= 7; i++) {
                  char ch='A'; 
            for (int j = 1; j<=8; j++) 
              {
                  if((i<=4  &&  i>=j  &&  j<=4)||(i>4  &&  j<=8-i  &&  j<4)){
                System.out.print((ch) + "\t");
                ch++;
                }
                else if((i<=4  &&  j>=9-i)||(i>4  &&  j>=1+i))
                   {
                       ch--;
                        System.out.print((ch) + "\t");

                   }
                 else 
                   {
                      System.out.print("\t");
                   }
            }
            System.out.println();
        }
    }
}


