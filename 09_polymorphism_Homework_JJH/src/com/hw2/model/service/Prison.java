package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private int prisonerCount ;
	private Prisoner[] prisoners;
	
	
	public Prison(int size) {
		prisonerCount =0;
		this.prisoners = new Prisoner[size];
		prisonerCount =0;
	}
	
	@Override
	public void addPerson(Person person) {
		 for (int i = 0; i < prisoners.length; i++) {
	            if (prisoners[i] == null) {
	            	prisoners[i] = (Prisoner) person; 
	            	prisonerCount++; 
	                System.out.print("직원이 추가되었습니다 - " + person.getInfo());
	                System.out.println();
	                return; 
			}
	        if(prisonerCount>prisoners.length)System.out.println("인원이 모두 충원되었습니다");
			}
	}

	@Override
	public void removePerson(String id) {
		for (int i = 0; i < prisoners.length; i++) {
            if (prisoners[i].getId().equals(id)) {
            	System.out.print("수감자가 삭제되었습니다 - " + prisoners[i].getInfo());
            	System.out.println();
            	prisoners[i] = null;
                return; 
			}else System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다");
		}
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		for(Prisoner emp : prisoners){
			if(emp == null)continue;
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
