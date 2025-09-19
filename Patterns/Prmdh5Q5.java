/*
Q5. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
*/
public class Prmdh5Q5{
    public static void main(String[] args) {
       
        for (int i=5;i>=1;i--)
         {//int c=1;
              for (int j=1;j<=i;j++)
              {
                  if(j==1||j==3||j==5 )
                  {
                      System.out.print(i+"\t");
                     // c++;
                  }
                  else
                   System.out.print("*\t");
                  
              }System.out.println();
         }
    }
}