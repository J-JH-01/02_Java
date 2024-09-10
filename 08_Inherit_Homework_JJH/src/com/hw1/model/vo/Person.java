package com.hw1.model.vo;

public class Person {
	//필드
	protected String name;
	private int age;
	private double height;
	private double weight;
	private int test;
	
	//생성자
	public Person() {
	}

	public Person( int age, double height, double weight) {
//		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//메서드
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
				name,age,height,weight); //스트링 클래스에 포맷이라는 메서드
		//printf 처럼 쓰면 그걸 문자열로 반환해주는 메서드
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	
}
