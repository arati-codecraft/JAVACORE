/*
Q83. Write a java program to print this pattern.


	1	A	2	B	3  
           C	     4     D     5  
                 6	 E	7  
          F        8     G       9  
       H	10	I	11	J
*/

public class Q19 {
    public static void main (String args[]) {
        int n = 1;
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            int temp = (i % 2 != 0) ? 0 : 1;
            boolean flag = true;
            if (i > 3) 
                temp = 1;
        

            for (int j = 1; j <= 9; j++) {
                if (j>=i &&  j<=10-i    && flag  ) {
                    if (temp == 0) {
                        System.out.print(n);
                        n++;
                        temp = 1;
                       
                    } else {
                        System.out.print(ch);
                        ch++;
                        temp = 0;
                       
                    }
                     flag = false;
                } 
               else if (j >= 6 - i && j <=i+4&&flag   && i > 3) {
                    if (temp == 0) {
                        System.out.print(n);
                        n++;
                        temp = 1;
                        
                    } else {
                        System.out.print(ch);
                        ch++;
                        temp = 0;
                       }
                      flag = false;
                }
               else {
                    System.out.print("  ");
                     flag=true;
                }
            }
            System.out.println();
        }
    }
}
