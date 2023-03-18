import java.lang.*;
import java.io.*;
import java.util.*;

public class Exception1
{
	public static void main(String args[])
	{
		try
		{
			int a[] = new int[5];
			a[5] = 15/0;
			
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is an Arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The index limit is out of the limit");
		}
		
		catch(Exception e)
		{
			System.out.println("The parent exception occurs here");
		}
		System.out.println("The program continues and ends here");
	}
}