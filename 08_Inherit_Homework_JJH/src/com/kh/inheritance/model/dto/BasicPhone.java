package com.kh.inheritance.model.dto;

import javax.print.attribute.standard.PrinterInfo;

public class BasicPhone extends Phone{

	//필드
	private boolean hasPhysicalKeyboard;
		
	//생성자
	public BasicPhone() {
		
	}

	public BasicPhone(String brand, String model, int
			year, int price, boolean hasPhysicalKeyboard) {
		super(brand,model,year,price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	//메서드
	public void checkKeyboard() {
		String x ="";
		if(hasPhysicalKeyboard)x = "이 휴대폰은 물리적 키보드가 있습니다";
		else x = "이 휴대폰은 물리적 키보드가 없습니다";
		printInfo();
		System.out.println(x);
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	
	
	
	
	
	
	
	
}
