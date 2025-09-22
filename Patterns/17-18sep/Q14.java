/*
Q78. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    				C	B	A
A	B     						B	A
A       						        A
A	B     						B	A
A	B	C   				C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A

*/
 
import java.util.*;

public class Q14 {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {


                if ((i <= 5 && (j <= 6 - i)) || (i > 5 && (j <= i - 4))) {
                    
                    char ch = (char) ('A' + j - 1);
                    System.out.print(ch + "\t");
                } 
                else if ((i <= 5 && j >= 4 + i) || (i > 5 && j >= 14 - i)) {
                   
                    char ch = (char) ('A' + (9 - j));
                    System.out.print(ch + "\t");
                } 
                 else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
