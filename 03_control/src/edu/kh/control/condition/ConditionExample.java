package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { //기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다");
		}
		if(input <= 0) {
			System.out.println("양수가 아니다");
		}
	
}
	
	
	public void ex2() {
		//if - else문
		// 조건식 결과가 true면 if문 수행

		//홀짝 검사
		//입력 받은 정수값이 홀수면 "홀수입니다" 출력
		// 0이면 0입니다
		// 짝수이면 "짝수입니다" 출력
		// else if 사용 x, 중첩 if문 사용
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if(input %2 != 0) {
			System.out.println("홀수 입니다");
		} else {
			// 짝수 또는 0 입력시 수행
			if(input ==0 ) {
				System.out.println("0 입니다");
			}else {
				System.out.println("짝수 입니다");
			}
		}
	}
	
	
	public void ex3() {
		//if(조건식) - else if(조건식2) - else
		
		//양수 , 음수, 0 판별
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		} else if (input ==0) {
			System.out.println("0입니다");
		} else {
			System.out.println("음수입니다");
		}
	}
	
	
	public void ex4() {
		// 달(month) 입력받아서 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 ( -15도 이하 : "한파 경보" / -12도 이하 "한파 주의보")
		// 3~5 봄
		// 6~8 여름 ( 35도 이상 : "폭염 경보" // 33도 이상 : "폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아닌 달을 입력했을때 "해당하는 계절 없음"
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season = null; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month == 12 || month == 1 || month == 2 ) {
			season = "겨울 ";
			
			System.out.print("온도 입력 : ");
			int temp = sc.nextInt();	
			
			if(temp <=-15) {
				//겨울 한파 경보 << 이런식으로 출력되었으면 좋겠음
				season += "한파 경보";
			}else if(temp <=-12) {
				season += "한파 주의보";
			}
			
		} else if (month >= 3 && month <=5) {
			season = "봄 ";
		} else if (month >= 6 && month <=8) {
			season = "여름 ";
			
			System.out.print("온도 입력 : ");
			int temp = sc.nextInt();	
			
			if(temp >=35) {
				season += "폭염 경보";
			}else if(temp >= 32) {
				season += "한파 주의보";
			}
			
		} else if (month >= 9 && month <=11) {
			season = "가을 ";
		} else {
			System.out.println("해당하는 계절 없음");
			return;
		}
		System.out.printf("%s입니다",season);

	}
	
	
	public void ex5() {

	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	
	if (age <= 13) {
		System.out.println("어린이입니다");
	} else if (age <=19) {
		System.out.println("청소년 입니다");
	} else {
		System.out.println("성인입니다");
	}
}

	
	public void ex6() {
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String grade = null;
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score < 60 && score >=0) {
			grade = "F";
		} else {
			grade = "잘못 입력하셨습니다";
		}
		System.out.println(grade);

	}
	
	
	public void ex7() {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		int hei = sc.nextInt();
		String sen = null;
		
		if (age>=12) {
			if(hei >= 140) {
				sen = "탑승 가능";
			} else {
				sen = "적정 키가 아닙니다";
			}	
		} else if (age <=11 && age >=0) {
			sen = "적정 연령이 아닙니다";
		} else {
			sen = "잘못 입력 하셨습니다";
		}
		
		System.out.println(sen);
	
}
	
	
	public void ex8() {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if (age < 0  || age > 100 ) {
			System.out.println("나이를 잘못 입력하셨습니다");
			return;}
		
		System.out.print("키를 입력하세요 : ");
		int hei = sc.nextInt();
		if ( hei < 0  || hei > 250 ) {
			System.out.println("키를 잘못 입력하셨습니다");
			return;}
		
		String sen = null;

		if (age >=12) {
			if(hei >=140)sen = "탑승가능";} 
		else {
			if(hei >= 140) {sen = "키는 적절하나, 나이는 적절치 않음";}
			else {sen = "나이와 키 모두 적절치 않음";}
		}
		
		System.out.println(sen);	
	}
	
	
}
