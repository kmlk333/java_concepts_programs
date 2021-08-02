package com.ITrator.study.comparator;

import java.util.Comparator;

import com.ITrator.study.model.Student;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
