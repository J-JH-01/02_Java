package com.hw1.model.vo;

public class Student extends Person{
	
	//필드
	private int grade;
	private String major;
	
	//생성자
	public Student() {
	}

	public Student(String name, int age , double height , double weight, int grade, String major) {
		super(age,height,weight);
		this.name = name;
		//상속받은 후손클래스에서 직접 접근 가능
		
		/*
		 * private 필드는 상속을 통해 자식 클래스가
		 * 부모 클래스의 필드를 물려받더라도
		 * getter/setter를 이용하여 간접접근을 해야한다
		 * 
		 * protected 필드는 상속받은 자식이 마치 원래 본인것이였던것처럼
		 * 사용가능하기 때문에 부모 필드에 직접 접근 가능
		 * 
		 * */
		
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		return super.information()+String.format(" / 학년 : %d / 전공 : %s", 
				grade,major);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	
	
	
	
}
