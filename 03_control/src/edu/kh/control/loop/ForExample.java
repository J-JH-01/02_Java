package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
// 기능 제공용 클래스
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		for(int i=1 ; i<10 ; i++) {
			System.out.println(i);
		}
	}
	
	
	public void ex2() {
		//영어 알파벳 A부터 Z까지 한줄로 출력
		for(int i=65 ; i < 91 ; i++) {
			char a = (char)i;
			System.out.print(a);
		}
		System.out.println("\n===================================");
		//혹은
		for(int i='A' ; i <= 'Z' ; i++) {
			System.out.print( (char)i );
		}
		System.out.println("\n===================================");
		//혹은
		for(char i='A' ; i <= 'Z' ; i++) {
			System.out.print( i );
		}
	}
	
	
	public void ex3() {}
	
	
	public void ex4() {}
	
	
	public void ex5() {}
	
	
	public void ex6() {}
}
