package abc;

import java.util.Scanner;

public class Hello {

	private static Scanner scan;

	public static void main(String[] args)
	{
	   scan = new Scanner(System.in);
	   System.out.println("enter number:");
	   int x = scan.nextInt();
	   System.out.println(x);
	   
	   System.out.println("enter number is decimal:");
	   double y = scan.nextInt();
	   System.out.println(y);
	   
	   int a,b,ans;
	   a =2;
	   b=3;
	   ans= a+b;
	   System.out.println("ans:"+ans);
	   
	   
	   
	}

}
