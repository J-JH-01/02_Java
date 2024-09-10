package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee[] empArr = new Employee[3];

		// 초기값 출력
		for (int i = 0; i < empArr.length; i++) {
			System.out.printf("emp[%d] : %d,%s,%s,%s,%d,%c,%d,%f.2,%s,%s", i, empArr[i].getEmpNo(),
					empArr[i].getEmpName(), empArr[i].getDept(), empArr[i].getJob(), empArr[i].getAge(),
					empArr[i].getGender(), empArr[i].getSalary(), empArr[i].getBonusPoint(), empArr[i].getPhone(),
					empArr[i].getAddress());

		}
		System.out.println("========================================================================================");
		for (int i = 0; i < 3; i++) {
			if (empArr[i].getEmpName().equals(null)) {
				System.out.println("이름이 없습니다 : ");
				empArr[i].setEmpName(sc.next());
			}
			if (empArr[i].getDept().equals(null)) {
				System.out.println("부서명이 없습니다 : ");
				empArr[i].setDept(sc.next());
			}
			if ( empArr[i].getJob().equals(null)) {
				System.out.println("직업이 없습니다 : ");
				empArr[i].setJob(sc.next());
			}
			if (empArr[i].getAge() == 0) {
				System.out.println("나이가 없습니다 : ");
				empArr[i].setAge(sc.nextInt());
			}
			if (empArr[i].getGender() == ' ') {
				System.out.println("성별이 없습니다 : ");
				empArr[i].setGender(sc.next().charAt(0));
			}
			if (empArr[i].getSalary()==0) {
				System.out.println("급여가 없습니다 : ");
				empArr[i].setSalary(sc.nextInt());
			}
			if (empArr[i].getBonusPoint()==0) {
				System.out.println("보너스포인트가 없습니다 : ");
				empArr[i].setBonusPoint(sc.nextInt());
			}
			if (empArr[i].getPhone().equals(null)) {
				System.out.println("전화번호가 없습니다 : ");
				empArr[i].setPhone(sc.next());
			}
			if (empArr[i].getAddress().equals(null)) {
				System.out.println("주소가 없습니다 : ");
				empArr[i].setAddress(sc.next());
			}
		}

		// 연봉 출력
		double pay12total = 0;
		for (int i = 0; i < empArr.length; i++) {

			double pay12 = empArr[i].getSalary() * (empArr[i].getSalary() * empArr[i].getBonusPoint()) * 12;

			pay12total += pay12;

			System.out.println(empArr[i].getEmpName() + "의 연봉 : " + pay12 + "원");
		}

		System.out.println("========================================================================================");
		System.out.println("직원들의 연봉의 평균 : " + pay12total + "원");

	}
}
