import java.io.*;
import java.lang.*;
import java.util.*;

class Solution3
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis = new FileInputStream("hello.txt");
			BufferedInputStream bs = new BufferedInputStream(fis);
			int l;
			while((l = bs.read())!=-1)
			{
				
				System.out.print((char)l);
		
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}