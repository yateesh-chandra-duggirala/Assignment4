import java.io.*;
import java.lang.*;
import java.util.*;

public class FileOutputStreamDemo
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("hello.txt",true);
			BufferedOutputStream bs = new BufferedOutputStream(fos);
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			byte b[] = str.getBytes();
			
			bs.write(b);
			bs.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}