package com.abstraction.cake;

public class OrderedCake extends Cake 
	{
	private String message;

	public OrderedCake() 
	{
		super("Round", "Vanila", 4);
	}

	protected OrderedCake(String shape, String flavour, int qty) 
	{
		super(shape, flavour, qty);
	}

	protected OrderedCake(String shape, String flavour, int qty, String messge) 
	{
		super(shape, flavour, qty);
		this.message = messge;
	}

	@Override
	public void showCake() 
	{
		if (message != null)
		{
			System.out.println("A " + super.getShape() + " shape " + super.getFlavour() + " Cake of " + super.getQty()
					+ " Kg is ready with " + this.message + " ₹ Rs." + super.getPrice() + "/-");
		}
		else
		{
			super.showCake();
		}
	}
}
