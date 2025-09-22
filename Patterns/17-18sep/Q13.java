/*
Q77. Write a java program to print this pattern.
A 	B 	C 	D
A     			D
A			D
A	B	C	D

*/

import java.util.*;
public class Q13 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            char ch = 'A';
            for (int j = 1; j <= 4; j++) {
                
                if (i == 1 || i == 4 || j == 1 || j == 4) 
             {
                    System.out.print(ch + "\t");
                    ch++;
                } 
              else {
                    System.out.print("\t");
                     ch++;
                }
               
            }
            System.out.println();
        }
    }
}
