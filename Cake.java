package com.abstraction.cake;

public abstract class Cake 
{
	private String shape;
	private String flavour;
	private int qty;
	private float price;
	
	protected Cake() 
	{
		super();
	}

	protected Cake(String shape, String flavour, int qty) 
	{
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.qty = qty;
		this.price = qty *400;
	}

	public String getShape() 
	{
		return shape;
	}

	public void setShape(String shape) 
	{
		this.shape = shape;
	}

	public String getFlavour() 
	{
		return flavour;
	}

	public void setFlavour(String flavour) 
	{
		this.flavour = flavour;
	}

	public int getQty()
	 {
		return qty;
	}

	public void setQty(int qty) 
	{
		this.qty = qty;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}
	
	protected void showCake()
	{
		System.out.println("A "+shape+ " shape "+flavour+"  Cake of "+qty+" Kg is ready ₹ Rs."+price+"/-");
	}
}