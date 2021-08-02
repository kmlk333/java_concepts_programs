package com.ITrator.study.comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String>
{

	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
