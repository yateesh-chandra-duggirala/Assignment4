import java.io.*;
import java.lang.*;

class Solution
{
	public static void main(String args[])
	{
		try
		{
			File f = new File("hello.txt");
			if(f.exists())
			{
				System.out.println("File Already exists...");
			}
			else
			{
				f.createNewFile();
				System.out.println("File is created Successfully...");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}