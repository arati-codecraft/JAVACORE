/*

Q7. Write a java program to print this pattern.

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1
*/

public class Diamond11Q7{
      public static void main (String args[])
          {
             for (int i=1;i<=9;i++)
                 {
                     for(int j=1;j<=9;j++)
                       {
                           if(j==4+i||i==4+j||i==6-j||i+j==14)
                            {
                                 System.out.print(i+"\t");
                             }
                            else
                              {
                                 System.out.print("\t");
                               }
                        }System.out.println();
                  }
           }
}