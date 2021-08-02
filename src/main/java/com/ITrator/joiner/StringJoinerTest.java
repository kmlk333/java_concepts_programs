package com.ITrator.joiner;

import java.util.StringJoiner;

public class StringJoinerTest 
{
	public static void main(String[] args) {
		StringJoiner strJoiner = new StringJoiner("-");
		
		strJoiner.add("Krishna");
		strJoiner.add("Mohan");
		strJoiner.add("Krishna");
		strJoiner.add("lal");
		strJoiner.add("Keshari");
		strJoiner.add("Krishna");
		
		System.out.println(strJoiner);
		
		StringJoiner preAndPostString = new StringJoiner(",", "(", ")");
		
		preAndPostString.add("Krishna");
		preAndPostString.add("Mohan");
		preAndPostString.add("Lal");
		preAndPostString.add("Keshari");
		
		System.out.println(preAndPostString);
	}
}
