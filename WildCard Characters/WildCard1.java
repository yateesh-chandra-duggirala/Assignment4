import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("A rectangle is drawn");
	}
}

class Circle extends Shape
{
	void draw()
	{
	System.out.println("A circle is drawn");
	}
}

class WildCard1
{
	public static void drawShapes(List <? extends Shape> lists)
	{
		for(Shape s: lists)
		{
			s.draw();
		}
	}
	
	public static void main(String args[])
	{
		List <Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		
		List <Circle> list2 = new ArrayList <Circle>();
		list2.add(new Circle());
		
		drawShapes(list1);
		drawShapes(list2);
	}
}	