/*
Q81. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A

*/



import java.util.*;
public class Q17 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int j = 1; j <= 9; j++) {
                
                if (j==1||j==9) 
             {
                    System.out.print('A'+"\t");
                    
                } 
                  else if (i == 1) {
                    if (j <= 5)
                      {
                        System.out.print((char)(ch + j - 1) + "\t"); // A B C D E
                       } 
                      else
                           {
                        System.out.print((char)(ch + 9 - j) + "\t"); 
                         }
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
