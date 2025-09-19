/*Q3. Write a java program to print this pattern.

	        *
             *	*
          * *	*
       * * *	*
    * * * *  *
*/

public class Pyramid3APP {
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 1; i <= 5; i++) 
          {
            // print spaces
            for (int j = i; j < 5; j++)
                  {
                System.out.print(" ");
                  }

            // print stars without extra space
            for (int k = 1; k <= i; k++) 
                {
                System.out.print("*");
                  }

            // move to next line
            System.out.println();
        }
    }
}