import java.lang.*;
import java.io.*;
import java.util.*;

public class ThrowAndThrows
{
	static void base() throws ArithmeticException
	{
			System.out.println("Inside the base method");
			throw new ArithmeticException("throwing Arithmetic Exception");
	}
	
	public static void main(String args[])
	{
		try
		{
			base();
		}
		catch(ArithmeticException e)	
		{
			System.out.println("Struck in main() Method");
		}
	}
}