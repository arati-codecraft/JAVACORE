/*
Q10. Write a java program to print this pattern.

	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7
*/

public class  CountDrum11Q10{
    public static void main(String[] args) {
       
         for (int i=4;i>1;i--)
         {int c=i;
              for (int j=1;j<=7;j++)
              {
                  if(j>4-i && j<4+i)
                  {
                      System.out.print((c=5-i)+"\t");
                      
                  }
                  else
                    {
                   System.out.print("\t");
                   }
              }System.out.println();
          }
         for (int i=1;i<=4;i++)
         {int c=4;
              for (int j=1;j<=7;j++)
              {
                  if(j>4-i && j<4+i)
                  {
                      System.out.print((c=3+i)+"\t");
                     
                  }
                  else
                    {
                   System.out.print("\t");
                   }
              }System.out.println();

         }
    }
}