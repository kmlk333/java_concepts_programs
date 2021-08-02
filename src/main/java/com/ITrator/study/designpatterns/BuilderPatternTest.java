package com.ITrator.study.designpatterns;

public class BuilderPatternTest {
	
	public static void main(String...a) {
		// TODO Auto-generated method stub
		User user = new User.UserBuilder("Krishna", "Keshari").build();
		
		System.out.println(user);
		
		User user1 = new User.UserBuilder("KM", "Keshari").age(10).phone(9544333).build();
		
		System.out.println(user1);
	}
}
