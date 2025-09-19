/*
Q1. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*
*/


public class butrQ1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if ((j== 1) || (i == j ) || (j==7) || (j==8-i) ) {
                    System.out.printf("*\t");
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.printf("\n");
        }
    }
}