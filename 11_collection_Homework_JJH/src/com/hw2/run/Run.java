package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Tiger tiger = new Tiger("사자");
		zoo.addAnimal(tiger);
		
		Monkey monkey = new Monkey("원숭이");
		zoo.addAnimal(monkey);
		
		int k=1;
		Scanner sc = new Scanner(System.in);
		while(k!=2) {
			zoo.displayMenu();
			k = sc.nextInt();
			
			if(k==1)zoo.showAnimals();
			else if(k==2) {System.out.println("프로그램을 종료합니다");return;}
			else {
				System.out.println("올바른 숫자로 다시 입력해주세요");
			}
		} 
		
	}
	
}
