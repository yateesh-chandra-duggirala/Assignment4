import java.lang.*;
import java.io.*;
import java.util.*;

public class Sample
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("10");
		list.add("Hello");
		String s = list.get(0);
		System.out.println(list);
		System.out.println(s);
	}
}
	