package com.hw2.model.dto;

public class Tiger extends Animal {
	public Tiger() {
		// TODO Auto-generated constructor stub
	}

	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.print("어흥하며 포효합니다\n");
	}
	
}
