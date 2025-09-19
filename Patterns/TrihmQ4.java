/*
Q4. Write a java program to print this pattern.

			*
		     *     *
		*	*	*
	     *     *        *     *
	*	*	*	*	*
*/


public class TrihmQ4
{  public static void main(String x[])
   {
      int i,j;
	  for(i=1; i<=5; i++)
	  {   boolean flag=true;
	     for(j=1; j<=9; j++)
		 {
		     if(j>=6-i && j<=4+i  && flag)
			 { System.out.printf("*");
		       flag=false;
			 }
			 else
			 { System.out.printf(" ");
		       flag=true;
			 }
		 }
		 System.out.printf("\n");
	  }
   
   }
}

