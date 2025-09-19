/*
Q2. Write a java program to print this pattern.
			
			1
		     1      2
	 	1	2	3
             1	     2	     3      4
	1	2	3	4	5

*/

public class Prmdh5Q2 {
    public static void main(String[] args) {
       
        for (int i=1;i<=4;i++)
         {int c=1;
              for (int j=1;j<=7;j++)
              {
                  if(j>4-i && j<4+i)
                  {
                      System.out.print(c+"\t");
                      c++;
                  }
                  else
                   System.out.print("\t");
                  
              }System.out.println();
         }
    }
}