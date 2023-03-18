import java.util.*;
import java.lang.*;
import java.io.*;

class TestGenerics1
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Yateesh Chandra");
		list.add("Maheswar");
		
		String s = list.get(1);
		System.out.println("Element is: "+s);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}