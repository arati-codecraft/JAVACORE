//Q3. Write a java program to print all alphabets from a to z. - using while loop

import java.util.*;
public class Alphabetatoz
{
public static void main (String args[])
      {
         
         
       
          char ch='a';
         do
         {
           System.out.println(ch);
           ch=(char)(ch+1);
         }while(ch<='z');
      }
}