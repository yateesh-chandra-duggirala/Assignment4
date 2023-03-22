import java.io.*;
import java.lang.*;
import java.util.*;

class Solution2
{
	public static void main(String args[])
	{
		try
		{
			Scanner s = new Scanner(new File("hello.txt"));
			System.out.println("The content is:");
			while(s.hasNextLine())
			{
				
				String line = s.nextLine();
				System.out.println(line);
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}