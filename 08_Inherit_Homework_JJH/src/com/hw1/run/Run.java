package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[3];
		Employee[] emp = new Employee[10];
		int count = 0;

		st[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		st[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		st[2] = new Student("강개순", 23, 167, 45, 4, "정보통신공학과");

		// 향상된 for 문!
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는 구조를 제공
		 * 
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서 반복작업에 용이
		 * 
		 * for(데이터타입 변수명 : 배열or컬렉션){ 반복해서 실행할 코드 }
		 */

		for (Student std : st) {
			System.out.println(std.information());
		}

		System.out.println("==============================================");

		while (true) {

			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double hei = sc.nextDouble();
			System.out.print("몸무게 : ");
			double wei = sc.nextDouble();
			System.out.print("급여 : ");
			int sal = sc.nextInt();
			System.out.print("부서 : ");
			String dep = sc.next();

			emp[count] = new Employee(name, age, hei, wei, sal, dep);
			count++;

			if (count > 10) {
				System.out.println("더 이상 추가할 수 없습니다");
				for (Employee em : emp) System.out.println(em.information());
				break;
			} else {

				System.out.print("계속 추가하시겠습니까 (y/n) : ");
				char yn = sc.next().toUpperCase().charAt(0);
				//대문자로 저장 반대는 Lowercase()

				if (yn == 'Y') continue;
				else break;
				
			}
						
		}
		for(Employee em : emp) {if(em == null)break;System.out.println(em.information());}

	}

}
