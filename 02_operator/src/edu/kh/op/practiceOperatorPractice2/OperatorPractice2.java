package edu.kh.op.practiceOperatorPractice2;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 나이는? : ");
	int a = sc.nextInt();
	
	System.out.println(a>20 ?  "저는 성인입니다" : "저는 청소년입니다");
	System.out.println((a>=13&a<=19) ?  "청소년입니까 true" : "false");
	System.out.println((a>=65 || a<=12) ?  "노인이거나 어린이 입니까? true" : "false");

	}
}
