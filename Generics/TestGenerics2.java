import java.util.*;
import java.lang.*;
import java.io.*;

class TestGenerics2
{
	public static void main(String args[])
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Yateesh Chandra");
		map.put(2, "Maheswar");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
				
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}