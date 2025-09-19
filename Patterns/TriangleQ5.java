/*
Q5. Write a java program to print this pattern.

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	


*/

public class  triangleQ5
{
    public static void main(String x[])
	{
	    int i,j;
		for(i=1; i<=9; i++)
		{
		    for(j=1; j<=5; j++)
 			{
                              if (j<=i )
                            {
                               if((j==1||j==3||j==5 ||j==10-i))
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