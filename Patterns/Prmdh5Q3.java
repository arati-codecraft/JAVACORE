/*
Q3. Write a java program to print this pattern.

	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1
*/
public class Prmdh5Q3 {
    public static void main(String[] args) {
       
        for (int i=5;i>=1;i--)
         {int c=1;
              for (int j=1;j<=9;j++)
              {
                  if(j>5-i && j<5+i)
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