package com.kh.inheritance.model.dto;

import javax.print.attribute.standard.PrinterInfo;

public class SmartPhone extends Phone{
	//필드
	private String operatingSystem;
	private int storageCapacity;
	
	//메서드
	public SmartPhone() {
	}

	public SmartPhone(String brand, String model, int
			year, int price, String operatingSystem, int
			storageCapacity) {
		super(brand,model,year,price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("noperatingSystem: " + operatingSystem+
				"\nstorageCapacity: " + storageCapacity + "GB"
				);
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
	
	
	
	
	
	
	
}
