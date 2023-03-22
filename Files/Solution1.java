import java.io.*;
import java.lang.*;

class Solution1
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("hello.txt",true);
			fw.write("Let us write some content in this file..!");
			fw.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}