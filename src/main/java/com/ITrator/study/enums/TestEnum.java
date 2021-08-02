package com.ITrator.study.enums;

public class TestEnum 
{
	public static void main(String...a)
	{

		System.out.println("----------Business Unit-----------");
		//System.out.println(BusinessUnit.GCG.toString());
		BusinessUnit bu = BusinessUnit.GCG;
		System.out.println(bu.getBuName());
		//System.out.println(bu.getBuValue());
		//System.out.println(bu.getValue());
		System.out.println(bu.name());
		//System.out.println(bu.toString());
		System.out.println(bu);
		System.out.println(BusinessUnit.IPB);
		
		System.out.println("----------Region-----------");
		System.out.println(Region.REGION_NAM.name());
		System.out.println(Region.REGION_NAM.toString());
		System.out.println(Region.REGION_NAM);
		System.out.println(Region.REGION_NAM.ordinal());
	}
}
