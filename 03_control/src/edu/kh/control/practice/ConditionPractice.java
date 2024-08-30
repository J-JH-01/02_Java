package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		System.out.print("숫자를 한 개 입력하세요");
		int a = sc.nextInt();
		
		if(a<=0) {System.out.println("정수만 입력해주세요");}
		else if(a%2 ==0) {System.out.println("짝수입니다.");}
		else {System.out.println("홀수입니다.");}
	}
	
	
	public void practice2() {
		System.out.print("국어점수 : ");
		int a = sc.nextInt();
		System.out.print("수학점수 : ");
		int b = sc.nextInt();
		System.out.print("영어점수 : ");
		int c = sc.nextInt();
		
		if (a < 40) {System.out.println("불합격입니다");return;}
		if (b < 40) {System.out.println("불합격입니다");return;}
		if (c < 40) {System.out.println("불합격입니다");return;}

		if ((a+b+c)/3 >=60) {System.out.println("축하합니다, 합격입니다!");}
		else {System.out.println("불합격입니다.");}
		
	}
	
	
	@SuppressWarnings("unused")
	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int a = sc.nextInt();
		int b = 0;
		
	
		switch(a) {
		case 1 : case 3: case 5 : case 7: case 8 : case 10 : case 12: b=31; break;
		case 4 : case 6 : case 9 : case 11 : b=30; break;
		case 2 : b=28; break;
		
		default : System.out.printf("%d월은 잘못 입력된 달입니다",a);
		}
		
		System.out.printf("%d월은 %d까지 있습니다",a,b);
		
}
	
	
	public void practice4() {
		System.out.print("키(m)을 입력해주세요 : ");
		double a = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		double b = sc.nextDouble();
		double c = b/(a*a)*10000;
		String d = null;
		
		if(c<18.5) { d= "저체중";}
		else if(c>=18.5 && c < 23) {
			d="정상체중";
		}
		else if(c>=23 && c < 25) {
			d="과체중";
		}
		else if(c>=25 && c < 30) {
			d="비만";
		}
		else if( c>= 30) {
			d="고도비만";
		}
		System.out.println("BMI 지수 : "+c);
		System.out.println(d);
	
	}
	
	
	public void practice5() {
		System.out.print("중간 고사 점수 : ");
		double a = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		double b = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double c = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		double d = sc.nextDouble();
		double e = a*0.2+b*0.3+c*0.3+d;
		
		if(d < 14 ) {
			System.out.printf("Fail [출석 횟수 부족 (%.0f/20)]",d);}
		else {
			System.out.println("================= 결과 =================");
			System.out.printf("중간 고사 점수(20) : %.1f\n",a);
			System.out.printf("기말 고사 점수(30) : %.1f\n",b);
			System.out.printf("과제점수          (30): %.1f\n",c);
			System.out.printf("출석점수          (20): %.1f\n",d);
			System.out.printf("총점 : %.1f\n",e);
			
			if (e<70) {
				System.out.println("Fail[점수미달]");}
			else {System.out.println("PASS");}
	

	}
	

	
	
	
	
	}
	
	
}
