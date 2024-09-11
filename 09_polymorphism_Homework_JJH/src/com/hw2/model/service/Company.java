package com.hw2.model.service;

import java.util.Iterator;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private int employeeCount;
	private Employee[] employees; 
	
	public Company(int size) {
		employeeCount = size;
		Employee[] employees = new Employee[employeeCount];
		employeeCount =0;
}	

	
	
	@Override
	public void addPerson(Person person) {
		for(Employee emp : employees) {
			if(emp == null) {
				emp = (Employee) person;
				break;
			}else {
				System.out.println("인원이 모두 충원되었습니다");
				return;
			}
			
		}
		System.out.print("직원이 추가되었습니다 - ");
		System.out.print(person.getInfo());
	}

	@Override
	public void removePerson(String id) {
		for(Employee emp : employees) {
			if(emp.getId().equals(id)) {
				emp = null;
				break;
			}else System.out.println("해당 id를 가진 직원을 찾을 수 없습니다");
		}
		//찾은후 정렬
		int index =0;
		
		for (int i = 0; i < employees.length; i++) {
			if(employees[i] != null) employees[index++]=employees[i];
		}
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		for(Employee emp : employees) {
			if(emp == null)break;
			else System.out.println(emp.getInfo());
		}
		
	}



	public int getEmployeeCount() {
		return employeeCount;
	}



	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}



	public Employee[] getEmployees() {
		return employees;
	}



	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	
	

}
