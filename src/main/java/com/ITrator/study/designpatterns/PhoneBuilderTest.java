package com.ITrator.study.designpatterns;

public class PhoneBuilderTest 
{
	public static void main(String[] args) {
		
		Phone phone = new Phone.PhoneBuilder("Samsung", "Note 10").build();
		
		System.out.println(" phone is " + phone);
		
		Phone phone2 = new Phone.PhoneBuilder("HTC", "Desire").imeiNumber(324342343).build();
		
		System.out.println(" phone 2 is " + phone2);
	}
}
