/*Q1. Write a java program to print this pattern.
			
             *
          *  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *
*/

public class Prmd1APP {
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 1; i <= 5; i++) 
          {
            // print spaces
            for (int j = i; j < 5; j++)
                  {
                   
                System.out.print(" ");
                  }

            
            for (int k = 1; k <= 2*i-1; k++) 
                {
             
                System.out.print("*");
                  }

            // move to next line
            System.out.println();
        }
    }
}