package com.abstraction.cake;

public class CakeMain 
{
	public static void main(String[] args) 
	{
		OrderedCake o = new OrderedCake();
		o.showCake();
		OrderedCake o1 = new OrderedCake("Round", "Vanila", 2);
		o1.showCake();
		OrderedCake o2 = new OrderedCake("Heart", "Chocolate",1, "Candel");
		o2.showCake();
	}
}