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
	
	
	public void ex3() {
		//1부터 입력받은수까지 1씩 증가하며 출력
		
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for(int i=1; i <= input ; i++) {
			System.out.println(i);
		}
	}
	
	
	public void ex4() {
		// 정수 5개를 입력받아서 합계 구하기
		// ex) 입력1 : 10
		// 입력2 : 20
		// 입력3 : 30
		// 입력4 : 40
		// 입력5 : 50
		// 합계 : 150
		int sum = 0;
		for(int i=1 ; i<=5 ; i++) {
			System.out.printf("입력 %d : ",i);
			sum += sc.nextInt();		}
		System.out.println("합계 : " + sum);
	}
	
	
	public void ex5() {
		//1부터 20까지 1씩 증가하면서 출력 단, 입력받은 수의 배수는 양쪽에 ()표시
		// 괄호를표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7...20
		
		System.out.println("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=20; i++) {
			if(i%num==0) {System.out.printf("(%d) ",i);}
			else {System.out.print(+i+" ");}
		}
	}
	
	
	public void ex6() {
		// [구구단 출력]
		//2~9 사이 수를 하나 입력받아
		// 해당 단을 출력, 단 입력받은 수가 2~9사이 숫자가 아니라면 "잘못입력하셨습니다" 출력
		System.out.print("숫자를 입력하세요");
		int num = sc.nextInt();
		if (num<2 && num>9) {System.out.println("잘못입력하셨습니다");}
		else { for(int i = 1 ; i<=9 ; i++) {
			System.out.printf("%d x %d = %d\n",num,i,i*num);
		} }
	}
	
	
	public void ex7() {
		for(int i=2 ; i<=9 ; i++) {
			for(int k=1 ; k<=9 ; k++) {
				System.out.printf("%d x %d = %2d  ",i,k,i*k);
			}
		System.out.println();
		//구구단 모두 역순 출력하기
		// 9단  -> 2단 까지는 역방향
		// 곱해지는 수는 1-> 9 정방향
		}
		System.out.println("==============================================================================================================================");
		for(int i=9 ; i>=2 ; i--) {
			for(int k=1 ; k<=9 ; k++) {
				System.out.printf("%d x %d = %2d  ",i,k,i*k);
			}
			System.out.println();}
		
	}
	
	
	public void ex8() {
		//숫자 세기 count
		//1부터 20까지 1씩 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		//배수 입력 : 3
		
		
		int sum = 0 ;
		int count = 0 ; // n의 배수의 개수를 세기 위한 변수
		String result = "";
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=20 ; i++) {
			if(i%input == 0) {
				result += i + " ";
				sum += i;
				count++;
			}
		}
		
		System.out.printf("%s : %d개\n",result,count);
		System.out.printf("%d의 배수의 합계 : %d",input,sum);
		
		
		
	}
	
}
