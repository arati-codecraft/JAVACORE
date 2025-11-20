//Q15. Write a java program to print all ASCII characters with their values.

public class Q15 {

    public static void AsciiCharVal() {
        
        int i = 0;
        while (i <= 127) 
		{ 
            System.out.println("Character: " + (char)i + "  ASCII Value: " + i);
            i++;
        }
    }
	public static void main(String[] args)
	{
	  System.out.println("ASCII characters and their values:");
	  AsciiCharVal();
	}
}
