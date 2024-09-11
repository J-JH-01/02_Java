package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private int prisonerCount ;
	private Prisoner[] prisoners = new Prisoner[prisonerCount];
	
	
	public Prison(int size) {
	}
	
	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public void removePerson(String id) {
		for(Prisoner emp : prisoners) {
			if(emp.getId().equals(id)) {
				emp = null;
				break;
			}else System.out.println("해당 id를 가진 직원을 찾을 수 없습니다");
		}
		//찾은후 정렬
		int index =0;
		
		for (int i = 0; i < prisoners.length; i++) {
			if(prisoners[i] != null) prisoners[index++]=prisoners[i];
		}
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		for(Prisoner emp : prisoners){
			if(emp == null)break;
			else System.out.println(emp.getInfo());
		}
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}
	
	

}
