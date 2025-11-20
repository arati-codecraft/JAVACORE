/*
7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation
*/

import java.util.*;

class VoteMachine
{
  private int age;
  private Scanner sc=new Scanner(System.in);
  
  public void setVoter()
  {
    System.out.println("enter the age of voter");
	age=sc.nextInt();
	
  }
  public void getVoter()
  {
    String result=(age>18)?"person is able to voting":"person is not able to voting";
	System.out.println(result);
  }
}

public class Q7CLOB
{
  public static void main (String args[])
  {
	VoteMachine vm=new VoteMachine();
  
     vm.setVoter();
     vm.getVoter();
  }
}