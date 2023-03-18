import java.lang.*;
import java.io.*;
import java.util.*;

public class LowerBoundWildCard
{
	public static void addNumbers(List <? super Integer> list)
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
		addNumbers(list1);
		
		
		List <Number> list2 = Arrays.asList(1.,2,4.1);
		System.out.println("The Number values are : ");
		addNumbers(list2);
		
	}
}
