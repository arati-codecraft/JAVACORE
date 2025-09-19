/*

Q3. Write a java program to print this pattern.

	*	*	*	*	*
	    *	     		     *
		*               *
		    *       *
			*  
*/    



public class TrihmQ3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 9; j++) {
                if (((i == 1) && (j % 2 != 0)) || (i == j )||j==10-i) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}