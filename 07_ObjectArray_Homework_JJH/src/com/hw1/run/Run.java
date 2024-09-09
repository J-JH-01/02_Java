package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
	
		Employee[] empArr = new Employee[3];
		
		
		double pay12total = 0;
		for(int i=0 ; i<empArr.length ; i++) {
			double pay12 = empArr[i].getSalary()*(empArr[i].getSalary()*empArr[i].getBonusPoint())*12;
			System.out.println();
		}
	}
}
