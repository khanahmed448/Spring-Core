package com.springcore.lifecyle;

public class Tea
{
    private double price;

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tea [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("init method");
	}
	public void destroy()
	{
		System.out.println("destroy method");
	}
	
}
