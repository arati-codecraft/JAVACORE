/*
Q3. Write a java program to print this pattern.

*	*	*	*	*	*	
     *      *      *        *    *        
	*	*	*	*
            *     *        *
	      *         *
	           *
*/

public class PrmdQ33
{  public static void main(String x[])
   {
      int i,j;
	  for(i=6; i>=1; i--)
	  {   boolean flag=true;
	     for(j=11; j>=1; j--)
		 {
		     if( j>=7-i && j<=5+i && flag)
			 { System.out.printf("*\t");
		       flag=false;
			 }
			 else
			 { System.out.printf("\t");
		       flag=true;
			 }
		 }
		 System.out.printf("\n");
	  }
   
   }
}

