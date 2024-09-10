package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone("Samsung","Galaxy S20",2020,1200000,"Android",128);
		BasicPhone bs = new BasicPhone("Nokia","3310",2000,100000,true);
	
		sm.printInfo();
		System.out.println("=================================================");
		bs.checkKeyboard();
		// bs.printInfo(); 
		// bs.checkKeyboard(): 로 나눠서 써도 됨
	}

}
