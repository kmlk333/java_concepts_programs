package com.ITrator.study.practice.serializable;

import java.io.Serializable;

public class Cat implements Serializable
{
	public int drink;
	public transient static double dob = 11;
	public transient double dobb = 12;
	public static long d = 150;
	public final static int legs = 4;
	
	public Cat(int drink)
	{
		this.drink = drink;
	}
	
	public String toString()
	{
		return "{drink ="+drink + ", dob=" + dob + ", dobb=" + dobb + ", d=" + d + ", legs=" + legs + "}";
	}
}
