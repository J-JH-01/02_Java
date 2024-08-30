package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
	
	System.out.print("인원 수 : ");
	int a = sc.nextInt();	
	
	System.out.print("사탕 개수 : ");
	int b = sc.nextInt();	
	
	System.out.printf("1인당 사탕 개수 : %d",b/a);
	System.out.println();
	System.out.printf("남는 사탕 개수 : %d",b%a);

	}

	
	public void practice2(){
		
	System.out.print("이름 : ");
	String a = sc.next();
	System.out.print("학년 : ");
	int b = sc.nextInt();
	System.out.print("반 : ");
	int c = sc.nextInt();
	System.out.print("번호 : ");
	int d= sc.nextInt();
	System.out.print("성별(남학생/여학생) : ");
	sc.nextLine();
	String e = sc.nextLine(); 
	// nextLine을 쓸 경우에는 입력버퍼를 한번 비우고 새로 시작해야하기 때문에
	// 안그러면 개행문자가 먼저 나가버려서 출력때 꼬여버림 
	// 굳이 쓰고싶다하면 sc.nextLine();을 단일로 한줄 쓰고 시작해서 입력버퍼를 비워야함
	System.out.print("성적 : ");
	float f = sc.nextFloat();
	
	System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",b,c,d,a,e,f);
	}
	
		
	public void practice3() {
		System.out.print("국어 : ");
		int a = sc.nextInt();	
		System.out.print("영어 : ");
		int b = sc.nextInt();	
		System.out.print("수학 : ");
		int c = sc.nextInt();	
		System.out.println();
		double d = (a+b+c)/3; 
		
		System.out.printf("합계 : %d ",a+b+c);	
		System.out.println();
		System.out.printf("평균 : %.1f",d);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
