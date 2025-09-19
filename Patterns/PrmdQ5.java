/*

Q5. Write a java program to print this pattern.

		#	#	#	#	#
		#	#
		#		#
		#			#
		#				#
*/

public class PrmdQ5 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++)
             { 
            for (int j = 1; j <= 5; j++) 
                 {
                if (i == 1 || (i == 2 && j <= 2) || j == 1 || j == i) 
                 {
                    System.out.print("#\t");
                } 
            else {
                    System.out.print("\t"); // Use tab for proper spacing
                }
            }
            System.out.println();
        }
    }
}
