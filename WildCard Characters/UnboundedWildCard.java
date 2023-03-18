import java.lang.*;
import java.io.*;
import java.util.*;

public class UnboundedWildCard
{
	public static void display(List <?> list)
	{
		for (Object n:list)
		{
			System.out.println(n);
		}
	
	}
	
	public static void main(String args[])
	{
		List <Integer> list1 = Arrays.asList(1,2,3);
		System.out.println("The Integer Values are : ");
		display(list1);
		
		
		List <String> list2 = Arrays.asList("Shiva","Yatee","4.1");
		System.out.println("The String values are : ");
		display(list2);
		
	}
}
