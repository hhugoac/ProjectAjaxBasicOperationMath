package com.ajaxoperaciones.model;

public class Restnumber {
	private int Num1;
	private int Num2;
	
	//Get and set methods
	public void setNum1(int Num1)
	{
		this.Num1=Num1;
	}
	public int getNum1()
	{
		return Num1;
	}
	public void setNum2(int Num2)
	{
		this.Num2=Num2;
	}
	public int getNum2()
	{
		return Num2;
	}
	
	//constructor Methods
	public Restnumber()
	{
		setNum1(0);
		setNum2(0);
	}
	public int Restnumber()
	{
		return Num1-Num2;
	}
}
