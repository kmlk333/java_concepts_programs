package com.ITrator.study.abstracts;

public class TestAbstract {

	public static void main(String[] args) {
		MyAbstract.show();
	
		new ChildAbstract(100).print();
	}
}
