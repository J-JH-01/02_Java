package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1 이상의 숫자를 입력하세요");
		int input = sc.nextInt();
		
		if (input > 0) {
			for(int i=1 ; i<=input ; i++) {
				System.out.println(i+" ");
			}
		}else {System.out.println("1 이상의 숫자를 입력해주세요");}
	}
	
	
	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요");
		int input = sc.nextInt();
		
		if (input > 0) {
			for(int i=input ; i>=1 ; i--) {
				System.out.println(i+" ");
			}
		}else {System.out.println("1 이상의 숫자를 입력해주세요");}
	}
	
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요");
		int input = sc.nextInt();
		int sum =0;
		for(int i=1 ; i<input ; i++) {
			System.out.print(i+" + ");
			sum +=i;
		}
		System.out.printf("%d = %d",input,sum+input);
		
	}
	
	
	public void practice4() {
		System.out.print("첫번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int input2 = sc.nextInt();
		if (input1 >0 && input2 >0) {
			for (int i = input1 ; i <=input2 ; i++) {
				System.out.println(i + " ");
			}
		}else {System.out.println("1 이상의 숫자를 입력해주세요");}
	}
	
	
	public void practice5() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("====="+ input + "단 =====");
		for(int i= 1 ; i<=9 ; i++) {
			System.out.printf("%d * %d = %d\n",input,i,input*i);
		}
	}
	
	
	public void practice6() {
		System.out.print("첫번째 숫자 : ");
		int input = sc.nextInt();
		if (input >=2 && input <=9) {
			for(int i = input ; i<=9 ; i++) {
				System.out.printf("===== %d단 =====",i);
				for(int k=1 ; k<=9 ;k++) {
					System.out.printf("%d X %d = %d\n",i,k,i*k);
				}
			}
		}else {
			System.out.println("2~9사이 숫자만 입력해주세요");
		}
	}
	
	
	public void practice7() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=input ; i>=1 ; i--) {
			for(int k=i ; k>=1 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice9() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			for(int j=0 ; j<input-i ; j++) {System.out.print(" ");}
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice10() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=input-1 ; i>=1 ; i--) {
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice11() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			for(int x=input-i ; x>0 ; x--) {System.out.print(" ");}
			for(int k=1 ; k<=(i*2-1) ; k++) {System.out.print("*");}
			
			System.out.println();
			
		/*
		 * for(int i=1 ; i<=input ; i++) {
		 * 	for(int k=1 ; k<input+i-1 ; k++) {
		 * 		if(int input-i >= k){syso(" ")}
		 * 		else(){syso("*")}
		 * system.out.println();
		 * } 
		 * 
		 * 
		 * */
		}
	}
	
	
	public void practice12() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++ ) {System.out.print("*");}
		System.out.println();
		for(int i=1 ; i<=input-2 ; i++) {
			System.out.print("*");
			for(int k=1 ; k<=input-2 ; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=1 ; i<=input ; i++ ) {System.out.print("*");}
	}
	
	
	public void practice13() {
		System.out.print("자연수 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		String str= "";
		
		int count = 0;
		
		for(int i=1; i<=input ; i++) {
			if(i%2 ==0 || i%3 ==0) {str += i+" "; }
			if(i%6==0) {count++;}
		}
		System.out.println(str);
		System.out.println("count : "+ count);
	}






}

