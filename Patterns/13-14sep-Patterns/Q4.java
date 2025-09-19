/*
Q4.  Write a java program to print this pattern.

	1	2	3	4	5
	6			7
	8		9
	10	11
	12
*/

public class Q4 {
    public static void main(String args[]) {
        int count = 1;

        for (int i = 5; i >= 1; i--) 
           {          
            for (int j = 1; j <= i; j++) 
           {      
                if (j == 1 || j == i || i == 5 || i == 1) {
                    System.out.print(count + "\t");
                    count++;
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