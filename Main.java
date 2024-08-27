package com.abstraction.cake;

import java.util.Scanner;

public class Main 
{
	static String shape;
	static String flavour;
	static int qty;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any one of the following : ");
		System.out.println("*****************************************");
		System.out.println("Select 1 to Order a cake with message");
		System.out.println("Select 2 to Order a cake without message");
		System.out.println("Select 3 to Order a default cake");
		System.out.println("*****************************************");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Enter cake shape : ");
			shape = sc.next();
			
			System.out.println("Enter cake flavour : ");
			flavour = sc.next();
			
			
			System.out.println("Enter cake quantity : ");
			qty = sc.nextInt();
			
			System.out.println("Enter Message you want to send with the cake : ");
			String msg = sc.nextLine();
			sc.nextLine();
			
			OrderedCake o = new OrderedCake(shape, flavour, qty, msg);
			o.showCake();
		}
		else if(ch == 2)
		{
			System.out.println("Enter cake shape : ");
			shape = sc.next();
			
			System.out.println("Enter cake flavour : ");
			flavour = sc.next();
			
			System.out.println("Enter cake quantity : ");
			qty = sc.nextInt();
		
			OrderedCake o = new OrderedCake(shape, flavour, qty);
			o.showCake();
		}
		else if(ch == 3)
		{
			OrderedCake o = new OrderedCake();
			o.showCake();
		}
		
		System.out.println("Thank you for using Cake application...");
		System.out.println("Visit again");
		sc.close();
	}
}