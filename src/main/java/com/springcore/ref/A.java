package com.springcore.ref;

public class A 
{
    private int x;
    private B ob;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the oB
	 */
	public B getob() {
		return ob;
	}
	/**
	 * @param oB the oB to set
	 */
	public void setob(B ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", oB=" + ob + "]";
	}
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
}
