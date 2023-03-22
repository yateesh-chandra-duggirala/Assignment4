import java.io.*;
import java.lang.*;
import java.util.*;

public class EmployeeManagement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		EmployeeInformation emp=new EmployeeInformation();
		int choice = 1;
		while(choice !=0)
		{
		    System.out.println("Please Enter your choice :");
		    System.out.println("Enter 1 for Insert :");
		    System.out.println("Enter 2 for Read :");
		    System.out.println("Enter 3 for copy the content from source to destination :");
		    System.out.println("-------------------------------------------");
		    System.out.print("I want to perform operation No. :");
		    choice=sc.nextInt();
		    if(choice >0 && choice <5)
		    {
		        switch(choice)
				{
					case 1 :
				        emp.insert();
						break;
					case 2 :
				       emp.read() ;
						break;
					case 3 :
				       System.out.print("Enter the name of destination file :");
					   String b=sc.next();
				       System.out.print("\n Enter the name of source file :");
					   String a=sc.next();
				       emp.copyContent(a,b);
						break;
				}
			}
			else
			{
				System.out.println("Invalid choice .");
			}
			System.out.println("-----------------------------------------------");
		    System.out.print("Press 1 for continue or 0 for exist :");
			choice=sc.nextInt();
		   
		}
	}
}