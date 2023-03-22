import java.lang.*;
import java.io.*;
import java.util.*;

public class FileIODemo
{
	public static void main(String args[])
	{
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			f = new File("filedemo.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File Does not Exist : "+f.getName());
		}
		
		catch(IOException e)
		{
			System.out.println("Problem in reading file :"+f.getName());
		}
		
		finally
		{
			try
			{
				br.close();
				fr.close();
			}
			
			catch(IOException e)
			{
				System.out.println("Problem in Closing File:"+f.getName());
			}

			catch(NullPointerException e)
			{
				System.out.println("Problem in closing file : "+f.getName());
			}
		}
	}
}