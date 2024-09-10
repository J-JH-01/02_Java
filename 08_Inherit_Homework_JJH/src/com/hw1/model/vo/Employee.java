package com.hw1.model.vo;

public class Employee extends Person {
	//필드
	private int salary;
	private String dept;
	
	//생성자
	public Employee() {
	}

	public Employee(String name, int age, double height, double weight , int salary, String dept) {
		super(age,height,weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	//메서드
	@Override
	public String information() {
		return super.information()+String.format(" / 급여 : %d / 부서 : %s",
				salary,dept);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
	
	
	
}
