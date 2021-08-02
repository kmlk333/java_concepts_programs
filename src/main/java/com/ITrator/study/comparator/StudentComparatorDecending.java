package com.ITrator.study.practice.comparator;

import java.util.Comparator;

import com.ITrator.study.practice.model.Student;

public class StudentComparatorDecending implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
