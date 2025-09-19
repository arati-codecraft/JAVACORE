/*
Q1. Write a java program to print this pattern.

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#
*/

import java.util.*;
public class PrmdQ1
{
     public static void main (String args[])
       {
           for (int i = 0; i < 5; i++) {
            int count = 5 - i; 

            for (int j = 0; j < count; j++) {
                if (i % 2 == 0) {
                    System.out.print("#\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
}
}