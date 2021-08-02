package com.ITrator.commons;

public class PassByValueTest {

	public static void main(String[] args) {
		
		PassByValue value = new PassByValue("ABC");
		
	}
	
	public static void changeReference(PassByValue ref) {
		PassByValue obj = new PassByValue("more");
		ref = obj;
	}
	
	public static void modifyReference(PassByValue change) {
		change.setAttributes("XYZ");
	}
}
