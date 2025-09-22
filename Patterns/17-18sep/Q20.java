/*
Q84. Write a java program to print this pattern.


	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D


*/

import java.util.*;
public class Q20 {
    public static void main(String args[]) {
        int n = 4; 
        
        for (int i = 1; i <= 7; i++) {
            int limit;
            if (i <= 4) {
                limit = i; 
            } else {
                limit = 8 - i; 
            }
            
            for (int j = 0; j < limit; j++) {
                System.out.print((char)('D' - j) + " ");
            }
            System.out.println();
        }
    }
}
