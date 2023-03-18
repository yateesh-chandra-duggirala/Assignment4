import java.lang.*;
import java.io.*;
import java.util.*;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String e)
	{
		super(e);
	}
}

public class CustomException
{
	static void validate(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Age is not valid to vote");
		}
		
		else
		{
				
			System.out.println("Welcome to vote");
		}
		
	}
	
	public static void main(String args[])
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the age:");
			int age = s.nextInt();
			validate(age);
		}
		
		catch(InvalidAgeException exc)
		{
			System.out.println("You are not eligible to vote.");
			System.out.println("This is an exception\n"+exc);
		
		}
		System.out.println("Thanks for visiting");
	}
}