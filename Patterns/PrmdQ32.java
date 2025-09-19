/*
Q2. Write a java program to print this pattern.

					*
				*		*
			*				*
		*						*
	*	*	*	*	*	*	*	*	*
*/

public class PrmdQ32
{  public static void main(String x[])
   {
      int i,j;
	  for(i=1; i<=5; i++)
	  {   
	     for(j=1; j<=9; j++)
		 {
		     if(i==5||j==6-i||j==4+i)
			 { System.out.printf("*\t");
		    
			 }
			 else
			 { System.out.printf("\t");
		    
			 }
		 }
		 System.out.printf("\n");
	  }
   
   }
}




