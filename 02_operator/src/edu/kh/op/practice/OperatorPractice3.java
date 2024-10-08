package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.print("가격을 입력 하세요 : ");
		float pr = sc.nextFloat();
		System.out.print("멤버십 있으세요? : ");
		boolean a = sc.nextBoolean();
		System.out.println();
		
		float k = a ? pr* 0.9f : pr*0.95f ;
		System.out.printf("할인을 포함한 최종금액 : %.1f",k);
	}
	
	public void practice2() {
		System.out.print("출금할 금액 입력 : ");
		int a = sc.nextInt();
		
		int q = a > 50000 ? a / 50000 : 0;
		q %= 50000;
		int w = a > 10000 ? a / 10000 : 0;
		q %= 10000;
		int e = a > 5000 ? a / 5000 : 0;
		q %= 5000;
		int r = a > 1000 ? a / 1000 : 0;
		
		System.out.printf("50000원 : %d",q);
		System.out.println();
		System.out.printf("10000원 : %d",w);
		System.out.println();
		System.out.printf("5000원 : %d",e);
		System.out.println();
		System.out.printf("1000원 : %d",r);		
	}

	public void practice3() {
		System.out.print("첫 번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int b = sc.nextInt();
		System.out.println();
		
		String x = (a%b)==0 ? "배수입니다" : "배수가 아닙니다";
		System.out.println(x);
		
	}
}
