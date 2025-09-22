/*

Q79. Write a java program to print this pattern.
A
B	C
C		D
D			E
E	F	G	H	I
*/

import java.util.*;

public class Q15 {
    public static void main(String args[]) {
        char ch = 'A';
        int n = 5; 

        for (int i = 1; i <= n; i++) {
             char ch1=ch;
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print(ch1 + "\t");
                    ch1++;                     
                } else {
                    System.out.print("\t");     
                }
            }
            System.out.println();
            if(i!=n)
              ch++;

                 
        }
    }
}
