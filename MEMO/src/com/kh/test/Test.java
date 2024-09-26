package com.kh.test;

import java.util.ArrayList;

import java.util.List;

import com.kh.test.model.vo.Student;

public class Test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("강건강",84));
		list.add(new Student("장건강",15));
		list.add(new Student("위건강",94));
		list.add(new Student("뇌건강",21));
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
	}

}
