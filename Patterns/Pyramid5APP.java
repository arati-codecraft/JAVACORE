/*
Q5. Write a java program to print this pattern.
#
#	*
#	*	#
#	*	#	*
#	*	#	*	#
*/

public class  Pyramid5APP
{
    public static void main(String x[])
	{
	    int i,j;
		for(i=1; i<=5; i++)
		{
		    for(j=1; j<=5; j++)
 			{
                              if (j<=i)
                            {
                               if(j==1||j==3||j==5)
                                 {
			       System.out.printf(" # ");
                                }
                               else 
                                 {System.out.printf(" * ");

                                  }
		             }
                         }
			System.out.printf("\n");
		}
	}
}

