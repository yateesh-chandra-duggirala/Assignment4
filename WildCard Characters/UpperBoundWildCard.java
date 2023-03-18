import java.lang.*;
import java.io.*;
import java.util.*;

public class UpperBoundWildCard
{
	private static Double add(ArrayList <? extends Number> num)
	{
		double sum = 0.0;
		for (Number n:num)
		{
			sum = sum + n.doubleValue();
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		ArrayList <Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		System.out.println("The sum of Integer Array List is : "+add(list1));
		
		ArrayList <Double> list2 = new ArrayList<Double>();
		list2.add(35.5);
		list2.add(45.8);
		System.out.println("The sum of Double ArrayList is : "+add(list2));
	}
}
