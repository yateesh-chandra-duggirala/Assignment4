import java.util.*;
import java.lang.*;
import java.io.*;

class TestGenerics4
{
	public static <E> void printArray(E[] elements)
	{
		for (E element : elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Integer[] intArray = {10,20,30,40,50};
		Character[] charArray = {'Y','A','T','E','E'};
		System.out.println("The Integer array is:");
		printArray(intArray);
		
		System.out.println("The Character Array is:");
		printArray(charArray);
		
	}
}