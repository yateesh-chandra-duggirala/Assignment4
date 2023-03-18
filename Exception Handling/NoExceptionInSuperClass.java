import java.lang.*;
import java.io.*;
import java.util.*;

class Parent
{
	void message()
	{
		System.out.println("This is a parent method");
	}
}

public class NoExceptionInSuperClass extends Parent
{
	void message() throws ArithmeticException
	{
		System.out.println("This is Child Method");
	}
	
	public static void main(String args[])
	{
		Parent p = new NoExceptionInSuperClass();
		p.message();
	}
}