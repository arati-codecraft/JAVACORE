/*
Q76. Write a java program to print this pattern.

					A
				#	#	#
                      A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A
*/

public class Q12 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {                  
             int row;
            if (i <= n) {
                row = i;   
            } else {
                row = 2 * n - i;            
                 }

            for (int j = 1; j <= 2 * n - 1; j++) {  
              

                if (j >= 5 - (row - 1) && j <= 5 + (row - 1)) {
                    if (row % 2 != 0) {  
                        int c;
                        if (j <=5) {
                            c = j - (5 - row);
                        } else {
                            c = (5 + row) - j;
                        }
                        char ch = (char) ('A' + c- 1);
                        System.out.print(ch + "\t");
                    } else {              
                        System.out.print("#\t");
                    }
                } else {
                    System.out.print("\t"); 
                }
            }
            System.out.println();
        }
    }
}
