
import java.io.*;
import java.util.Scanner;

public class Addition3 extends Object 
{					    
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers for Addition : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("Sum of "+x+" and "+y+" is "+z);
	}
}
