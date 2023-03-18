import java.lang.*;
import java.io.*;
import java.util.*;


public class GenericClass<T>
{
	T obj;
	void add(T obj)
	{
		this.obj = obj;
	}
	T get()
	{
		return obj;
	}
}
