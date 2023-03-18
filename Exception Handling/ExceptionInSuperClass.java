import java.lang.*;
import java.io.*;
import java.util.*;

class Parent
{
	void message() throws Exception
	{
		System.out.println("This is a parent method");
	}
}

public class ExceptionInSuperClass extends Parent
{
	void message() throws Exception //or ArithmeticException
	{
		System.out.println("This is Child Method");
	}
	
	public static void main(String args[])
	{
		Parent p = new ExceptionInSuperClass();
		
		try
		{
			p.message();
		}
		
		catch(Exception e)
		{
		
		}
	}
}