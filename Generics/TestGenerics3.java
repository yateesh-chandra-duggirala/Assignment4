import java.lang.*;
import java.io.*;
import java.util.*;

class TestGenerics3
{
	public static void main(String args[])
	{
		GenericClass<Integer> m = new GenericClass<Integer>();
		m.add(2);
		System.out.println(m.get());
	}
}